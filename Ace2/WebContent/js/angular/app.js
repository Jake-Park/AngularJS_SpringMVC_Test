  var app = angular.module('Admin', ['ngRoute', 'ngCookies']);
  
 
    app.config(function($routeProvider) {
	  $routeProvider.when('/login',
	  {
		controller: 'LoginController',
		templateUrl: '/view/adminInfo/loginForm.html'
	  }).when('/list',
	  {
	    controller: 'ListController',
	    templateUrl: '/view/adminInfo/adminInfoList.html'
	  }).when('/add',
	  {
	    controller: 'AddController',
		templateUrl: '/view/adminInfo/adminInfoReg.html'
	  }).when('/edit/:id',
	  {
		controller: 'AddController',
		templateUrl: '/view/adminInfo/adminInfoReg.html'
	  }).when('/logout/:id',
	  {
		controller: 'LoginController',
		templateUrl: '/view/adminInfo/loginForm.html'
	  }).otherwise(
	  {
	      redirectTo: '/login'
	  });
	});
    
    app.run(['$rootScope', '$location', 'Auth', function ($rootScope, $location, Auth) {
    	$rootScope.location = $location;
    	$rootScope.Auth = Auth;
    	
        $rootScope.$on('$routeChangeStart', function (event) {
        	var path = $location.path();
            if (path != "/add" && !Auth.isLoggedIn()) {
                console.log('DENY');
                event.preventDefault();
                $location.path('/login');
            }
            else {
                //console.log('ALLOW');
                //$location.path('/list');
            }
        });
    }]);
    
    app.factory('Auth', ['$cookieStore',  function($cookieStore){

    	return{
    	    setUser : function(aUser){
    	    	$cookieStore.put('userInfo', aUser);
    	    },
    	    getUser : function(){
    	    	return $cookieStore.get("userInfo");
    	    },
    	    isLoggedIn : function(){
    	        return ($cookieStore.get("userInfo"))? true : false;
    	    }    	    
    	  }
    	}]);
    
    app.controller('LoginController', ['$scope', '$http', '$location', '$cookieStore', '$routeParams', 'Auth', 
                                       function($scope, $http, $location, $cookieStore, $routeParams, Auth) {
    	
    	// Logout - Delete Cookie
  	    if($routeParams.id) {
  	    	//console.log("---" + Auth.getUser());
  	    	$cookieStore.put('userInfo', null);
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
				console.log(id);
				var res = $http.get('/adminInfo/deleteAdminInfo/' + id);
				res.success(function(data, status, headers, config) {
					console.log(data);	
					$scope.lists = [];
					$scope.getList($scope.pagination.current());
				});
				res.error(function(data, status, headers, config) {
					console.log( "failure message: " + JSON.stringify({data: data}));
				});
			}
		};
  }]);	
	
	app.controller('AddController', ['$scope', '$http', '$location', '$routeParams', function($scope, $http, $location, $routeParams) {
		$scope.title = "Add";
		
	  $scope.add = function() {
 			var dataObj = {
					email : $scope.email,
					password : $scope.password,
					name : $scope.name,
					mobileNumber : $scope.mobileNumber,					
			};	
 			console.log(dataObj);
 			
 			
			var res = $http.post('/adminInfo/add/' + $scope.title + '/' + $routeParams.id, dataObj);			
			res.success(function(data, status, headers, config) {
				console.log(data);
				$location.path('/login');
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

