	app.controller('RetryController', ['$scope', '$http', '$location', 'PaginatonService', '$filter', 'CodeUtil', 
	    function($scope, $http, $location, PaginatonService, $filter, CodeUtil) {
	    $scope.lists = [];
	    $scope.total = 0;
	    $scope.pageIndex = 1;
	    
	    $scope.getList = function(pageIndex, klass) {//
	    	//console.log($scope.pagination.current() + "pageIndex : " + pageIndex);	
	    	if($scope.pagination && $scope.pagination.hasList(pageIndex)) {
	    		return;
	    	}
	    	else {
	    		$scope.pageIndex = pageIndex;
	    	}
	    	
	    	var	dataObj = {
    			pageIndex : pageIndex
			};
	    	
	    	// Set search keyword
	    	if(klass) {
	    		dataObj.klass = klass;
	    		
		    	if(klass == 1) {					
					dataObj.keyword = $scope.keyword;
		    	}	    	
		    	else if(klass == 2) {
					dataObj.logId = $scope.logId;
					dataObj.category = $scope.category;
					dataObj.workOrderNum = $scope.workOrderNum;
		    	}
	    	}
	    	
	    	//console.log(dataObj);
			
			// get LogMaster List
			var res = $http.post('/retry/list', dataObj);			
			res.success(function(data, status, headers, config) {
				//console.log(JSON.stringify(data));
				
				// Convert date format
				for(var i=0; i < data.length; i++) {
					//console.log(data[i].createdDate + "_" + c_datetime);
					data[i].createdDate = $filter('date')(data[i].createdDate, 'yyyy-MM-dd HH:mm');
					
					var state = data[i].state;
					data[i].stateClass = state == "FIN" ? "text-success" : state == "STA" ? "text-info" : "text-danger";
					data[i].state = CodeUtil.getCodeValue("PROCESS_STATUS", state);
					data[i].subProcess = CodeUtil.getCodeValue("SUB_PROCESS", data[i].subProcess);
					
				}
				
				$scope.lists = data;
			});
			res.error(function(data, status, headers, config) {
				console.log( "failure message: " + JSON.stringify({data: data}));
			});
			
			// get Total Count
			res = $http.post('/retry/listCount', dataObj);
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
		
		$scope.retry = function(logId, subProcess, MWNO) {//
			if(confirm('Will you retry this job?')) {				
				//console.log(id);
				var dataObj = {
					logId : logId,
					subProcess : subProcess,
					MWNO : MWNO
				};	
				
				var res = $http.post('/retry/retryJob', dataObj);
				res.success(function(data, status, headers, config) {
					//console.log(data);
					$scope.lists = [];
					$scope.getList($scope.pagination.current());
				});
				res.error(function(data, status, headers, config) {
					console.log( "failure message: " + JSON.stringify({data: data}));
				});
			}
		};
  }]);	