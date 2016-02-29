	app.controller('LogDetailController', ['$scope', '$http', '$location', 'PaginatonService', '$filter', 'CodeUtil', '$routeParams', 
	    function($scope, $http, $location, PaginatonService, $filter, CodeUtil, $routeParams) {
	    $scope.lists = [];
	    $scope.total = 0;
	    $scope.pageIndex = 1;
	    $scope.logId = $routeParams.logId ? $routeParams.logId : "";
	    
	    $scope.getList = function(pageIndex, logId) {	    	
	    	// Checking the page existed
	    	if($scope.pagination && $scope.pagination.hasList(pageIndex)) {
	    		return;
	    	}
	    	else {
	    		$scope.pageIndex = pageIndex;
	    	}
	    	
			var dataObj = {					
				pageIndex : pageIndex,
				logId : $scope.logId
			};	
			console.log("dataObj : " + dataObj.logId);
			
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
					}
					data[i].createdDate = $filter('date')(data[i].createdDate, 'yyyy-MM-dd HH:mm');
					data[i].logLevel = CodeUtil.getCodeValue("LOG_LEVEL", data[i].logLevel);
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
	    
	    console.log($routeParams.logId);
	    
  }]);	