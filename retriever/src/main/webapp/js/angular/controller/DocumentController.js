
    
	app.controller('DocumentController', ['$scope', '$http', '$location', '$route', 'Auth', 
	                    	               function($scope, $http, $location, $route, Auth) {
		$scope.showUpload = true;
		$scope.showUploadButton = false;
		$scope.showPayButton = true;
		$scope.showDownload = false;
		$scope.showBar = false;
		$scope.points = 0;
    	    
	    $scope.initDocument = function() {//
	    	console.log("points : " + Auth.getUser().points);
	    	var points = Auth.getUser().points;
	    	if(points >= 50) {
	    		$scope.showUploadButton = true;
	    		$scope.showPayButton = false;
	    	}
	    	$scope.points = points;
	    };
	    
	    $scope.upload = function($event){
	    	console.log("continueFileUpload : ");
	    	if(!file.files[0]) {
	    		alert("Please, select file!");
	    	}
	    	
	    	$("#progress_bar").css({left:$event.pageX - 800, top:$event.pageY - 20});
			// Show Progress Bar
			$scope.showBar = true;
			
	    	var uploadUrl="/uploadFile";
	    	var formData=new FormData();
	    	console.log(file.files[0]);
	    	formData.append("file",file.files[0]);
	    	
	    	try {
    	    	$http({
    	    	    method: 'POST',
    	    	    url: uploadUrl,
    	    	    headers: {'Content-Type': undefined},
    	    	    data: formData,
    	    	    transformRequest: function(data, headersGetterFunction) {
    	    	    	return data;
    	    	    }
    	    	}).success(function(data) {   
    	    		console.log("success : " + data.id);
    	    		if(data.id) {
    	    			$scope.showUpload = false;
    	    			$scope.showDownload = true;
    	    			$scope.fileName = data.downloadFileName
    	    			$scope.id = encodeURIComponent(data.id);
    	    		}
    	    		$scope.showBar = false;
    	    	}).error(function(data) {
    				console.log( "failure message: " + JSON.stringify({data: data}));
    				$scope.showBar = false;
    			});
	    	}
	    	catch(e) {
	    		//console.log(e);
	    	}
	    };
    }]);    
	