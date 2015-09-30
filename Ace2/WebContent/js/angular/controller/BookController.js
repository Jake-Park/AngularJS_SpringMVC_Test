	app.controller('BookController', ['$scope', '$http', '$location', '$filter', 'Auth', '$modal', '$log', 
	    function($scope, $http, $location, $filter, Auth, $modal, $log) {
	    $scope.lists = [];
	    $scope.bookList = [];
	    $scope.dates = [];
	    $scope.items = [];
	    $scope.selectedDate;
	    
	    $scope.getDate = function() {//
	    	var today = new Date();
	    	$scope.dates = [
	    			$filter('date')(today, 'yyyy-MM-dd EEE'),
	    			$filter('date')(today.setDate(today.getDate() + 1), 'yyyy-MM-dd EEE'),
	    			$filter('date')(today.setDate(today.getDate() + 1), 'yyyy-MM-dd EEE'),
	    			$filter('date')(today.setDate(today.getDate() + 1), 'yyyy-MM-dd EEE'),
	    	];
	    	
	    	var dataObj = {
	    		userId : Auth.getUser().email
	    	};
	    		    	
			var res = $http.post('/book/all', dataObj);
			res.success(function(data, status, headers, config) {
				//console.log(data);
				$scope.bookList = data;
				
		    	var index = 0;
		    	for(var i=0; i < 24; i++) {
		    		for(var j=0; j < 60; j+=30) {
		    			var time = pad(i.toString(), 2, '0', 1) + ":" + pad(j.toString(), 2, '0', 1);
		    			
		    			$scope.lists[index++] = {
		    					'time' : time,
		    					'first' : getCount($scope.dates[0], $scope.bookList, time),
		    					'firstDate' : ($scope.dates[0]).split(" ")[0] + "_" + time,
		    					'second' : getCount($scope.dates[1], $scope.bookList, time),
		    					'secondDate' : ($scope.dates[1]).split(" ")[0] + "_" + time,
		    					'third' : getCount($scope.dates[2], $scope.bookList, time),
		    					'thirdDate' : ($scope.dates[2]).split(" ")[0] + "_" + time,
		    					'fourth' : getCount($scope.dates[3], $scope.bookList, time),
		    					'fourthDate' : ($scope.dates[3]).split(" ")[0] + "_" + time
		    			};
		    		}
		    	}
			});

			res.error(function(data, status, headers, config) {
				console.log( "failure message: " + JSON.stringify({data: data}));
			});	    	
	    };
	    
	    $scope.openLayer = function(datetime) {
	    	getData(datetime); 
	    }
	    
	    var getCount = function(t_date, lists, time) {
	    	var count = 0;
	    	var today = new Date();
	    	var c_date = $filter('date')(today, 'yyyy-MM-dd');
	    	var c_time = $filter('date')(today, 'HHmm');
	    	t_date = t_date.substring(0, 10);

	    	c_time = parseInt(c_time);	// current time
	    	var p_time = parseInt(time.replace(":", ""));	// parameter time
	    	
/*	    	console.log(c_date + ":" + t_date);
	    	console.log(c_time + ":" + time.replace(":", "") + ":" +
	    			(p_time - c_time));*/
	    	
	    	if(c_date == t_date && (c_time >= p_time
	    			|| (p_time - c_time) < 70)) {
	    		return "-";
	    	}
	    	
			for(var i = 0; i < lists.length; i++) {
				
				var bookTime = (lists[i].bookTime + "").substring(0, 5);
				
				//console.log(t_date + "--" + lists[i].bookDate + "--" + time + "--" + bookTime);
				
				if(t_date == lists[i].bookDate
						&& time == bookTime) {
					count++;
				}
			}
			
			return count > 0 ? (count == 1 ? count + " opening" : count + " openings") : count;
		};
		
		var getData = function (datetime) {
			//var res = angular.element($("[ng-controller='BookController']")).injector().get('Layer').getDataList(datetime);
			var dataObj = {
				bookDate : datetime.split("_")[0],
				bookTime : datetime.split("_")[1]
			};
			
			var res = $http.post('/book/getAvailTeacherList', dataObj);			
			res.success(function(data) {
				console.log(data);
				$scope.items = data;
				$scope.selectedDate = datetime;
				open();
				//writeLayer(data, datetime);
			});
			
			res.error(function(data) {
				console.log( "failure message: " + JSON.stringify({data: data}));
			});
		};

	  $scope.animationsEnabled = true;

	  var open = function (size) {

		var modalInstance = $modal.open({
		  animation: $scope.animationsEnabled,
		  templateUrl: 'myModalContent.html',
		  controller: 'ModalInstanceCtrl',
		  size: size,
		  resolve: {
		    items: function () {
		      return $scope.items;
		    },
		    selectedDate : function() {
		    	return $scope.selectedDate;
		    },
		    boolBooked : function() {
		    	return false;
		    }
		  }
		});
	  };

	  $scope.toggleAnimation = function () {
	    $scope.animationsEnabled = !$scope.animationsEnabled;
	  };
  }]);	