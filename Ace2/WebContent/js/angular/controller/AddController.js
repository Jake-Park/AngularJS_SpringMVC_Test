	app.controller('AddController', ['$scope', '$http', '$location', '$routeParams', function($scope, $http, $location, $routeParams) {
		$scope.title = "Add";
		
	  $scope.add = function() {
 			var dataObj = {
					email : $scope.email,
					password : $scope.password,
					name : $scope.name,
					mobileNumber : $scope.mobileNumber,					
			};	
 			//console.log(dataObj);
 			
			var res = $http.post('/adminInfo/add/' + $scope.title + '/' + $routeParams.id, dataObj);			
			res.success(function(data, status, headers, config) {
				$location.path($routeParams.path);				
			});
			res.error(function(data, status, headers, config) {
				console.log( "failure message: " + JSON.stringify({data: data}));
			});		 
	    };
	    
	    // Call User Data
	  if($routeParams.id) {
			var res = $http.get('/adminInfo/adminInfoView/' + $routeParams.id);	
			res.success(function(data, status, headers, config) {
				//console.log(data);
				$scope.email = data.email;
				$scope.name = data.name;
				$scope.mobileNumber = data.mobileNumber;
				$scope.title = "Edit";
			});
			res.error(function(data, status, headers, config) {
				console.log( "failure message: " + JSON.stringify({data: data}));
			});			  
	  }
	}]);