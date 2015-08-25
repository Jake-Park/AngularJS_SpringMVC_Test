	app.controller('ListController', ['$scope', '$http', '$location', 'PaginatonService', function($scope, $http, $location, PaginatonService) {
	    $scope.lists = [];
	    
	    $scope.getList = function(pageIndex) {//
	    	//console.log($scope.pagination.current() + "pageIndex : " + pageIndex);		    	
	    	
			var dataObj = {
				pageIndex : pageIndex
			};	
			
			// get Member List
			var res = $http.post('/adminInfo/adminInfoList', dataObj);			
			res.success(function(data, status, headers, config) {
				//console.log(JSON.stringify(data));
				$scope.lists = data;
			});
			res.error(function(data, status, headers, config) {
				console.log( "failure message: " + JSON.stringify({data: data}));
			});
			
			// get Total Count
			res = $http.post('/adminInfo/adminInfoTotal', dataObj);
			res.success(function(data, status, headers, config) {
				//console.log("Total : " + data);
				$scope.lists = data;				
			});
			res.error(function(data, status, headers, config) {
				console.log( "failure message: " + JSON.stringify({data: data}));
			});
			
			$scope.pagination.setCurrent(pageIndex);
			//console.log($scope.pagination.current() + "current : ");		    	
	    	
	    };
	    
		$scope.pagination = PaginatonService.Pagination(10);
		
		$scope.deleteRecord = function(id) {//
			if(confirm('Will you delete this?')) {
				//console.log(id);
				var res = $http.get('/adminInfo/deleteAdminInfo/' + id);
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