	app.controller('DashboardController', ['$scope', '$http', '$location', '$route', 'Auth', 
	               function($scope, $http, $location, $route, Auth) {
	    $scope.lists = [];
	    $scope.items = [];
	    
	    $scope.getDashboardList = function() {//
	    	console.log("pageIndex : ");		    	
	    				

	    };
	    
		$scope.cancelRecord = function(id) {//
			if(confirm('Will you cancel this?')) {
				//console.log(id);
				var res = $http.get('/dashboard/cancelBooking/' + id);
				res.success(function(data, status, headers, config) {
					//console.log(data);	
					$scope.lists = [];
					$route.reload();
				});
				res.error(function(data, status, headers, config) {
					console.log( "failure message: " + JSON.stringify({data: data}));
				});
			}
		};
		
    }]);