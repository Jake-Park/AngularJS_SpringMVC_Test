app.controller('LoginController', ['$scope', '$http', '$location', '$cookieStore', '$routeParams', 'Auth', 'CodeUtil',   
                                       function($scope, $http, $location, $cookieStore, $routeParams, Auth, CodeUtil) {
	
    	// Logout - Delete Cookie
    if($routeParams.id) {    	 
    	console.log("---" + Auth.getUser());
    	$cookieStore.put('userInfo', null);
    	$location.path("/login");
    }

  	  $scope.login = function() {
  			//		
  			var dataObj = {
				email : $scope.id,
				password : $scope.password
  			};	
  			console.log(dataObj);

  			var res = $http.post('/user/login', dataObj);			
  			res.success(function(data, status, headers, config) {
  				
  				if(data) {
  					Auth.setUser(data); //Update the state of the user in the app
  					CodeUtil.init();
  					//window.location.replace("/view/index.html");
  					$location.path("/dashboard");
  				}
  				else {
  					alert("Fail to login!");
  				}
  			});
  			res.error(function(data, status, headers, config) {
  				console.log( "failure message: " + JSON.stringify({data: data}));
  			});		
  			// Making the fields empty
  			//
  			$scope.id='';
  			$scope.password='';
  			
  			// Initilize content box height
  	 	  $('.row.well').css({height: 'auto'});
  		  $('.footer').css({ height: 40 });
  	  };
  	  
}]);   



	
