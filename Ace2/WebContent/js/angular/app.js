// detect mobile device
window.mobilecheck = function() {
  var check = false;
  (function(a){if(/(android|bb\d+|meego).+mobile|avantgo|bada\/|blackberry|blazer|compal|elaine|fennec|hiptop|iemobile|ip(hone|od)|iris|kindle|lge |maemo|midp|mmp|mobile.+firefox|netfront|opera m(ob|in)i|palm( os)?|phone|p(ixi|re)\/|plucker|pocket|psp|series(4|6)0|symbian|treo|up\.(browser|link)|vodafone|wap|windows ce|xda|xiino/i.test(a)||/1207|6310|6590|3gso|4thp|50[1-6]i|770s|802s|a wa|abac|ac(er|oo|s\-)|ai(ko|rn)|al(av|ca|co)|amoi|an(ex|ny|yw)|aptu|ar(ch|go)|as(te|us)|attw|au(di|\-m|r |s )|avan|be(ck|ll|nq)|bi(lb|rd)|bl(ac|az)|br(e|v)w|bumb|bw\-(n|u)|c55\/|capi|ccwa|cdm\-|cell|chtm|cldc|cmd\-|co(mp|nd)|craw|da(it|ll|ng)|dbte|dc\-s|devi|dica|dmob|do(c|p)o|ds(12|\-d)|el(49|ai)|em(l2|ul)|er(ic|k0)|esl8|ez([4-7]0|os|wa|ze)|fetc|fly(\-|_)|g1 u|g560|gene|gf\-5|g\-mo|go(\.w|od)|gr(ad|un)|haie|hcit|hd\-(m|p|t)|hei\-|hi(pt|ta)|hp( i|ip)|hs\-c|ht(c(\-| |_|a|g|p|s|t)|tp)|hu(aw|tc)|i\-(20|go|ma)|i230|iac( |\-|\/)|ibro|idea|ig01|ikom|im1k|inno|ipaq|iris|ja(t|v)a|jbro|jemu|jigs|kddi|keji|kgt( |\/)|klon|kpt |kwc\-|kyo(c|k)|le(no|xi)|lg( g|\/(k|l|u)|50|54|\-[a-w])|libw|lynx|m1\-w|m3ga|m50\/|ma(te|ui|xo)|mc(01|21|ca)|m\-cr|me(rc|ri)|mi(o8|oa|ts)|mmef|mo(01|02|bi|de|do|t(\-| |o|v)|zz)|mt(50|p1|v )|mwbp|mywa|n10[0-2]|n20[2-3]|n30(0|2)|n50(0|2|5)|n7(0(0|1)|10)|ne((c|m)\-|on|tf|wf|wg|wt)|nok(6|i)|nzph|o2im|op(ti|wv)|oran|owg1|p800|pan(a|d|t)|pdxg|pg(13|\-([1-8]|c))|phil|pire|pl(ay|uc)|pn\-2|po(ck|rt|se)|prox|psio|pt\-g|qa\-a|qc(07|12|21|32|60|\-[2-7]|i\-)|qtek|r380|r600|raks|rim9|ro(ve|zo)|s55\/|sa(ge|ma|mm|ms|ny|va)|sc(01|h\-|oo|p\-)|sdk\/|se(c(\-|0|1)|47|mc|nd|ri)|sgh\-|shar|sie(\-|m)|sk\-0|sl(45|id)|sm(al|ar|b3|it|t5)|so(ft|ny)|sp(01|h\-|v\-|v )|sy(01|mb)|t2(18|50)|t6(00|10|18)|ta(gt|lk)|tcl\-|tdg\-|tel(i|m)|tim\-|t\-mo|to(pl|sh)|ts(70|m\-|m3|m5)|tx\-9|up(\.b|g1|si)|utst|v400|v750|veri|vi(rg|te)|vk(40|5[0-3]|\-v)|vm40|voda|vulc|vx(52|53|60|61|70|80|81|83|85|98)|w3c(\-| )|webc|whit|wi(g |nc|nw)|wmlb|wonu|x700|yas\-|your|zeto|zte\-/i.test(a.substr(0,4)))check = true})(navigator.userAgent||navigator.vendor||window.opera);
  return check;
}

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
    	    },
    	    isMobile : function() {
    	    	  var check = false;
    	    	  (function(a){if(/(android|bb\d+|meego).+mobile|avantgo|bada\/|blackberry|blazer|compal|elaine|fennec|hiptop|iemobile|ip(hone|od)|iris|kindle|lge |maemo|midp|mmp|mobile.+firefox|netfront|opera m(ob|in)i|palm( os)?|phone|p(ixi|re)\/|plucker|pocket|psp|series(4|6)0|symbian|treo|up\.(browser|link)|vodafone|wap|windows ce|xda|xiino/i.test(a)||/1207|6310|6590|3gso|4thp|50[1-6]i|770s|802s|a wa|abac|ac(er|oo|s\-)|ai(ko|rn)|al(av|ca|co)|amoi|an(ex|ny|yw)|aptu|ar(ch|go)|as(te|us)|attw|au(di|\-m|r |s )|avan|be(ck|ll|nq)|bi(lb|rd)|bl(ac|az)|br(e|v)w|bumb|bw\-(n|u)|c55\/|capi|ccwa|cdm\-|cell|chtm|cldc|cmd\-|co(mp|nd)|craw|da(it|ll|ng)|dbte|dc\-s|devi|dica|dmob|do(c|p)o|ds(12|\-d)|el(49|ai)|em(l2|ul)|er(ic|k0)|esl8|ez([4-7]0|os|wa|ze)|fetc|fly(\-|_)|g1 u|g560|gene|gf\-5|g\-mo|go(\.w|od)|gr(ad|un)|haie|hcit|hd\-(m|p|t)|hei\-|hi(pt|ta)|hp( i|ip)|hs\-c|ht(c(\-| |_|a|g|p|s|t)|tp)|hu(aw|tc)|i\-(20|go|ma)|i230|iac( |\-|\/)|ibro|idea|ig01|ikom|im1k|inno|ipaq|iris|ja(t|v)a|jbro|jemu|jigs|kddi|keji|kgt( |\/)|klon|kpt |kwc\-|kyo(c|k)|le(no|xi)|lg( g|\/(k|l|u)|50|54|\-[a-w])|libw|lynx|m1\-w|m3ga|m50\/|ma(te|ui|xo)|mc(01|21|ca)|m\-cr|me(rc|ri)|mi(o8|oa|ts)|mmef|mo(01|02|bi|de|do|t(\-| |o|v)|zz)|mt(50|p1|v )|mwbp|mywa|n10[0-2]|n20[2-3]|n30(0|2)|n50(0|2|5)|n7(0(0|1)|10)|ne((c|m)\-|on|tf|wf|wg|wt)|nok(6|i)|nzph|o2im|op(ti|wv)|oran|owg1|p800|pan(a|d|t)|pdxg|pg(13|\-([1-8]|c))|phil|pire|pl(ay|uc)|pn\-2|po(ck|rt|se)|prox|psio|pt\-g|qa\-a|qc(07|12|21|32|60|\-[2-7]|i\-)|qtek|r380|r600|raks|rim9|ro(ve|zo)|s55\/|sa(ge|ma|mm|ms|ny|va)|sc(01|h\-|oo|p\-)|sdk\/|se(c(\-|0|1)|47|mc|nd|ri)|sgh\-|shar|sie(\-|m)|sk\-0|sl(45|id)|sm(al|ar|b3|it|t5)|so(ft|ny)|sp(01|h\-|v\-|v )|sy(01|mb)|t2(18|50)|t6(00|10|18)|ta(gt|lk)|tcl\-|tdg\-|tel(i|m)|tim\-|t\-mo|to(pl|sh)|ts(70|m\-|m3|m5)|tx\-9|up(\.b|g1|si)|utst|v400|v750|veri|vi(rg|te)|vk(40|5[0-3]|\-v)|vm40|voda|vulc|vx(52|53|60|61|70|80|81|83|85|98)|w3c(\-| )|webc|whit|wi(g |nc|nw)|wmlb|wonu|x700|yas\-|your|zeto|zte\-/i.test(a.substr(0,4)))check = true})(navigator.userAgent||navigator.vendor||window.opera);
    	    	  return check;
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

	
