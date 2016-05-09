	app.controller('LogDetailController', ['$scope', '$http', '$location', '$filter', 
	                                       'CodeUtil', '$routeParams',  
	    function($scope, $http, $location, $filter, CodeUtil, $routeParams) {
	    $scope.lists = [];
	  	$scope.totalItems = 0;
		$scope.currentPage = 1;
	    $scope.gLogId = $routeParams.logId ? $routeParams.logId : "";
	    	    
	    
	    $scope.getList = function(pageIndex) {	    	
	    	// Checking the page existed
	    	$scope.currentPage = pageIndex;
	    	
			var dataObj = {					
				pageIndex : pageIndex
			};
			
	    	// Set search keyword
	    	if($scope.keyword) {					
				dataObj.keyword = $scope.keyword;
	    	}	    	
	    	else {
				dataObj.logId = $scope.logId;
				dataObj.className = $scope.className;
				dataObj.methodName = $scope.methodName;
				dataObj.logLevel = $scope.logLevel;
	    	}
			
			//console.log($scope.gLogId + "dataObj : " + dataObj.logId);
			
			// get LogMaster List
			var res = $http.post('/logDetail/list/'+$scope.gLogId, dataObj);			
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
			res = $http.post('/logDetail/listCount/'+$scope.gLogId, dataObj);
			res.success(function(data, status, headers, config) {
				console.log("Total : " + data);
				$scope.totalItems = data;
			});
			res.error(function(data, status, headers, config) {
				console.log( "failure message: " + JSON.stringify({data: data}));
			});
			
			//console.log($scope.pagination.current() + "current : ");		    	
	    	
	    };
	    
	    $scope.showDetailLog = function(text) {
	    	/*$("#dialog").dialog( "open" );
	    	$("#dialog").text(text);*/
	    	
	    	$('#myModal').find('.modal-body').html(text);
		};	    
  }]);	
	