	app.controller('AddController', ['$scope', '$http', '$location', '$routeParams', 'Auth', 
	    function($scope, $http, $location, $routeParams, Auth) {
		$scope.title = "Register";
/*		$scope.email = 'mwallgren@integrationwizards.com';
		$scope.password = 'C5gateway';
		
		$scope.confirmPassword = 'C5gateway';
		$scope.name = 'Mathias Wallgren';
		$scope.company = 'Integeration Wizards';
		$scope.phoneNumber = '0402123456';*/
		
	  $scope.add = function() {
		  console.log($scope.userForm.$valid);
		  if(!$scope.userForm.$valid) {
			  return;
		  }
		  
		  if($scope.password != $scope.confirmPassword) {
			  alert('Password and Confirm password are not matched!');
			  return;
		  }
		   
 			var dataObj = {
					email : $scope.email,
					password : $scope.password,
					name : $scope.name,
					company : $scope.company,
					phoneNumber : $scope.phoneNumber,					
			};	
 			//console.log(dataObj);
 			
			var res = $http.post('/user/add/' + $scope.title + '/' + $routeParams.id, dataObj);			
			res.success(function(data, status, headers, config) {
			    
				console.log($routeParams.path);		    
				alert("Success to register!");
				
				// Edit
				if($routeParams.path) {
					Auth.setUser(data);
					$location.path($routeParams.path);
				}
				else {	// Register
					$location.path("/login");
				}
				
			});
			res.error(function(data, status, headers, config) {
				console.log( "failure message: " + JSON.stringify({data: data}));
			});		 
	    };
	    
	    // Call User Data
	  if($routeParams.id) {
			var res = $http.get('/user/view/' + $routeParams.id);	
			res.success(function(data, status, headers, config) {
				console.log(data);
				$scope.email = data.email;
				$scope.name = data.name;
				$scope.company = data.company;
				$scope.phoneNumber = data.phoneNumber;
				$scope.title = "Edit";
			});
			res.error(function(data, status, headers, config) {
				console.log( "failure message: " + JSON.stringify({data: data}));
			});			  
	  }
	}]);
	
	app.directive('validPasswordC', function () {
	    return {
	        require: 'ngModel',
	        link: function (scope, elm, attrs, ctrl) {
	            ctrl.$parsers.unshift(function (viewValue, $scope) {
	                var noMatch = viewValue != scope.userForm.password.$viewValue;
	                ctrl.$setValidity('noMatch', !noMatch);
	            })
	        }
	    }
	});