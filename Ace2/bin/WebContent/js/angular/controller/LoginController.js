    app.controller('LoginController', ['$scope', '$http', '$location', '$cookieStore', '$routeParams', 'Auth', 
                                       function($scope, $http, $location, $cookieStore, $routeParams, Auth) {
    	
    	// Logout - Delete Cookie
  	    if($routeParams.id) {
  	    	$cookieStore.put('userInfo', null);
  	    	$location.path("/login");
  	    }
  	    
  	  $scope.login = function() {
  			//		
  			var dataObj = {
  					email : $scope.email,
  					password : $scope.password
  			};
/*  			
  			var dataObj2 = {
  					id : "jake",
  					password : "1234"
  			};	
  			console.log("---@-------");
  			
  			var ress = $http.post('http://54.153.206.60:8080/otp/getSyncCode', dataObj2);
  			ress.success(function(data, status, headers, config) {
  				console.log(data);	
  			});
  			ress.error(function(data, status, headers, config) {
  				console.log( "failure message: " + JSON.stringify({data: data}));
  			});*/

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

	


	
