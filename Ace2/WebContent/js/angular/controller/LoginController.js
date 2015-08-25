    app.controller('LoginController', ['$scope', '$http', '$location', '$cookieStore', '$routeParams', 'Auth', 
                                       function($scope, $http, $location, $cookieStore, $routeParams, Auth) {
    	
    	// Logout - Delete Cookie
  	    if($routeParams.id) {
  	    	console.log("---" + Auth.getUser());
  	    	$cookieStore.put('userInfo', null);
  	    	$location.path("/login");
  	    }
  	    
  	  $scope.login = function() {
  			//		
  			var dataObj = {
  					email : $scope.email,
  					password : $scope.password
  			};	

  			var res = $http.post('/adminInfo/loginForm', dataObj);			
  			res.success(function(data, status, headers, config) {
  				
  				if(data) {
  					Auth.setUser(data); //Update the state of the user in the app
  					//window.location.replace("/view/index.html");
  					$location.path("/list");
  				}				
  			});
  			res.error(function(data, status, headers, config) {
  				console.log( "failure message: " + JSON.stringify({data: data}));
  			});		
  			// Making the fields empty
  			//
  			$scope.email='';
  			$scope.password='';
  	    };  	    

  	  }]);   

	


	
