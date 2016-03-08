	app.controller('LogDetailController', ['$scope', '$http', '$location', 'PaginatonService', '$filter', 
	                                       'CodeUtil', '$routeParams', '$modal', 
	    function($scope, $http, $location, PaginatonService, $filter, CodeUtil, $routeParams, $modal) {
	    $scope.lists = [];
	    $scope.total = 0;
	    $scope.pageIndex = 1;
	    $scope.gLogId = $routeParams.logId ? $routeParams.logId : "";
	    	    
	    
	    $scope.getList = function(pageIndex, klass) {	    	
	    	// Checking the page existed
	    	if($scope.pagination && $scope.pagination.hasList(pageIndex)) {
	    		return;
	    	}
	    	else {
	    		$scope.pageIndex = pageIndex;
	    	}
	    	
			var dataObj = {					
				pageIndex : pageIndex
			};	
			
			if($scope.gLogId != "") {
				dataObj.logId = $scope.gLogId;
			}
			
	    	// Set search keyword
	    	if(klass) {
	    		dataObj.klass = klass;
	    		
		    	if(klass == 1) {					
					dataObj.keyword = $scope.keyword;
		    	}	    	
		    	else if(klass == 2) {
					dataObj.logId = $scope.logId;
					dataObj.className = $scope.className;
					dataObj.methodName = $scope.methodName;
					dataObj.logLevel = $scope.logLevel;
		    	}
	    	}
			
			//console.log($scope.gLogId + "dataObj : " + dataObj.logId);
			
			// get LogMaster List
			var res = $http.post('/logDetail/list', dataObj);			
			res.success(function(data, status, headers, config) {
				//console.log(JSON.stringify(data));
				
				// Convert date format
				for(var i=0; i < data.length; i++) {
					//console.log(data[i].createdDate + "_" + c_datetime);
					var classMethod = data[i].classMethod;
					if(classMethod.indexOf(":") >= 0) {
						data[i].className = classMethod.split(":")[0];
						var classNameList = (data[i].className).split(".");
						data[i].className = classNameList[classNameList.length - 1];						
						data[i].methodName = classMethod.split(":")[1];
						
						var text = data[i].text;
						if(text && text.length > 100) {
							var orgText = text;
							data[i].textFlag = 'false';							
							
							text = text.substring(0, 50) + "...";
							data[i].text = text;
							data[i].detailText = orgText;
						}
						else {
							data[i].textFlag = 'true';							
						}
						//data[i].text = $sce.trustAsHtml(text);
						
					}
					data[i].createdDate = $filter('date')(data[i].createdDate, 'yyyy-MM-dd HH:mm');
					var logLevel = data[i].logLevel;
					data[i].logLevel = CodeUtil.getCodeValue("LOG_LEVEL", logLevel);
					data[i].logClass = logLevel == "DEB" ? "text-success" : logLevel == "INF" ? "text-info" : "text-danger";
				}
				
				$scope.lists = data;
			});
			res.error(function(data, status, headers, config) {
				console.log( "failure message: " + JSON.stringify({data: data}));
			});
			
			// get Total Count
			res = $http.post('/logDetail/listCount', dataObj);
			res.success(function(data, status, headers, config) {
				console.log("Total : " + data);
				$scope.pagination = PaginatonService.Pagination(data, 10);
				$scope.pagination.setCurrent(pageIndex);
			});
			res.error(function(data, status, headers, config) {
				console.log( "failure message: " + JSON.stringify({data: data}));
			});
			
			//console.log($scope.pagination.current() + "current : ");		    	
	    	
	    };
	    
	    $scope.showDetailLog = function(text) {
			var modalInstance = $modal.open({
			  animation: true,
			  templateUrl: 'myModalContent.html',
			  controller: 'ModalInstanceCtrl',
			  resolve: {
			    text: function () {
			      return text;
			    }
			  }
			});
		};	    
  }]);	
	
	// Please note that $modalInstance represents a modal window (instance) dependency.
	// It is not the same as the $modal service used above.


app.controller('ModalInstanceCtrl', function ($scope, $modalInstance, text) {
	  $scope.text = text;

	  $scope.cancel = function () {
	    $modalInstance.dismiss('cancel');
	  };
	    
});		