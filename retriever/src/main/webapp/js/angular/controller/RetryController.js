	app.controller('RetryController', ['$scope', '$http', '$location', 'PaginatonService', '$filter', 'CodeUtil', 
	    function($scope, $http, $location, PaginatonService, $filter, CodeUtil) {
	    $scope.lists = [];
	    $scope.total = 0;
	    $scope.pageIndex = 1;
	    
	    $scope.getList = function(pageIndex) {//
	    	//console.log($scope.pagination.current() + "pageIndex : " + pageIndex);	
	    	if($scope.pagination && $scope.pagination.hasList(pageIndex)) {
	    		return;
	    	}
	    	else {
	    		$scope.pageIndex = pageIndex;
	    	}
	    	
			var dataObj = {
				pageIndex : pageIndex
			};	
			
			// get LogMaster List
			var res = $http.post('/retry/list', dataObj);			
			res.success(function(data, status, headers, config) {
				//console.log(JSON.stringify(data));
				
				// Convert date format
				for(var i=0; i < data.length; i++) {
					//console.log(data[i].createdDate + "_" + c_datetime);
					data[i].createdDate = $filter('date')(data[i].createdDate, 'yyyy-MM-dd HH:mm');
					data[i].state = CodeUtil.getCodeValue("PROCESS_STATUS", data[i].state);
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
				//console.log("Total : " + data);
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