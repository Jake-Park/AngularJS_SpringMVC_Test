	app.controller('RetryController', ['$scope', '$http', '$location', '$filter', 'CodeUtil', 
	    function($scope, $http, $location, $filter, CodeUtil) {
	    $scope.lists = [];
	  	$scope.totalItems = 0;
		$scope.currentPage = 1;
	    
	    $scope.getList = function(pageIndex, klass) {//
	    	//console.log($scope.pagination.current() + "pageIndex : " + pageIndex);
	    	$scope.currentPage = pageIndex;
	    	
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
					data[i].modifiedDate = $filter('date')(data[i].modifiedDate, 'yyyy-MM-dd HH:mm');
					
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
				$scope.totalItems = data;
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
		
		$scope.finish = function(category, logId) {//
			if(confirm('Will you finish this job?')) {				
				//console.log(id);
				var dataObj = {
					category : category,
					logId : logId
				};	
				
				var res = $http.post('/retry/finishJob', dataObj);
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
	
	app.controller('PaginationDemoCtrl', function ($scope, $log) {
		  $scope.totalItems = 64;
		  $scope.currentPage = 4;

		  $scope.setPage = function (pageNo) {
		    $scope.currentPage = pageNo;
		  };

		  $scope.pageChanged = function() {
		    $log.log('Page changed to: ' + $scope.currentPage);
		  };

		  $scope.maxSize = 5;
		  $scope.bigTotalItems = 175;
		  $scope.bigCurrentPage = 1;
		});