	app.controller('RetryController', ['$scope', '$http', '$location', '$filter', 'CodeUtil', 
	    function($scope, $http, $location, $filter, CodeUtil) {
	    $scope.lists = [];
	  	$scope.totalItems = 0;
		$scope.currentPage = 1;
		$scope.klass;
		$scope.showBar = false; 
	    
	    $scope.getList = function(pageIndex) {//
	    	$scope.showWarning = true;
	    	//console.log($scope.pagination.current() + "pageIndex : " + pageIndex);
	    	$scope.currentPage = pageIndex;
	    	
	    	var	dataObj = {
    			pageIndex : pageIndex
			};
	    	
	    	// Set search keyword    		
	    	if($scope.keyword) {
				dataObj.keyword = $scope.keyword;
	    	}	    	
	    	else {
				dataObj.logId = $scope.logId;
				dataObj.category = $scope.category;
				dataObj.workOrderNum = $scope.workOrderNum;
				dataObj.startDate = $scope.startDate;
				dataObj.endDate = $scope.endDate;
	    	}
	    	
	    	//console.log(dataObj);
			
			// get LogMaster List
			var res = $http.post('/retry/list', dataObj);			
			res.success(function(data, status, headers, config) {
				//console.log(JSON.stringify(data));
				
				// Convert date format
				for(var i=0; i < data.length; i++) {
					//console.log(data[i].createdDate + "_" + c_datetime);
					data[i].modifiedDate = $filter('date')(data[i].modifiedDate, 'yyyy-MM-dd HH:mm');
					
					var subProcess = data[i].subProcess;
					data[i].subProcessText = CodeUtil.getCodeValue("SUB_PROCESS", subProcess);
					
					var state = data[i].state;
					if(subProcess != "") {
						// Checking whether the status is suspended or not
						var count = data[i].count;
						var maxCounts = CodeUtil.getCodeValue("ENV", subProcess);
						//console.log(count + ":" + maxCounts + ":" + subProcess + ":" + state);
						if(state == "ERR" && count < maxCounts) {
							state = "SUS";
						}
					}
					
					
					//data[i].stateClass = state == "FIN" ? "text-success" : state == "STA" ? "text-info" : "text-danger";
					switch (state) {
					    case "FIN":
					    	data[i].stateClass = "text-success";
					        break;
					    case "STA":
					    	data[i].stateClass = "text-info";
					        break;
					    case "SUS":
					    	data[i].stateClass = "text-warning";
					        break;
					    default:
					    	data[i].stateClass = "text-danger";
					}
					//console.log(state + ":" + data[i].stateClass);
					data[i].state = CodeUtil.getCodeValue("PROCESS_STATUS", state);
				}
				
				$scope.lists = data;
			});
			res.error(function(data, status, headers, config) {
				console.log( "failure message: " + JSON.stringify({data: data}));
			});
			
			// get Total Count
			res = $http.post('/retry/listCount', dataObj);
			res.success(function(data, status, headers, config) {
				console.log("Total : " + data);
				$scope.totalItems = data;
			});
			res.error(function(data, status, headers, config) {
				console.log( "failure message: " + JSON.stringify({data: data}));
			});
			
			//console.log($scope.pagination.current() + "current : ");		    	
	    	
	    };
		
		$scope.retry = function($event, logId, subProcess, MWNO) {//
			if(confirm('Will you retry this job?')) {
				
				//console.log(":" + $event.pageX + ' , ' + $event.pageY + ", " + $event.offsetX + ", " + $event.offsetY);
			 	$("#progress_bar").css({left:$event.pageX - 800, top:$event.pageY - 110});
			 	
				// Show Progress Bar
				$scope.showBar = true;
				//console.log(id);
				var dataObj = {
					logId : logId,
					subProcess : subProcess,
					MWNO : MWNO
				};	
				
				var res = $http.post('/retry/retryJob', dataObj);
				res.success(function(data) {
					//console.log(data);
					$scope.lists = [];
					$scope.getList($scope.currentPage);
					$scope.showBar = false;
				});
				res.error(function(data, status) {
					console.log( "failure message: " + JSON.stringify({data: data}));
					console.log(status);
					alert("Error Code : " + status);
					$scope.getList($scope.currentPage);
					$scope.showBar = false;
				});
			}
		};
		
		$scope.finish = function(category, logId) {//
			if(confirm('Will you finish this job?')) {				
				//console.log(id);
				var dataObj = {
					category : category,
					logId : logId
				};	
				
				var res = $http.post('/retry/finishJob', dataObj);
				res.success(function(data) {
					//console.log(data);
					$scope.lists = [];
					$scope.getList($scope.currentPage);
				});
				res.error(function(data) {
					console.log( "failure message: " + JSON.stringify({data: data}));
				});
			}
		};
		
// DatePicker Setting
	  $scope.popup1 = {
	    opened: false
	  };

	  $scope.popup2 = {
	    opened: false
	  };		
	
	  $scope.open1 = function() {
	    $scope.popup1.opened = true;
	  };

	  $scope.open2 = function() {
	    $scope.popup2.opened = true;
	  };	
	  
	  $scope.clear = function() {
	    $scope.startDate = null;
	    $scope.endDate = null;
	  };		  
	  
	  $scope.inlineOptions = {
	    customClass: getDayClass,
	    minDate: new Date(),
	    showWeeks: true
	  };

	  $scope.dateOptions = {
	    dateDisabled: disabled,
	    formatYear: 'yy',
	    maxDate: new Date(),
	    minDate: new Date(2010, 5, 22),
	    startingDay: 1
	  };		  
	  
	  function getDayClass(data) {
	    var date = data.date,
	      mode = data.mode;
	    if (mode === 'day') {
	      var dayToCheck = new Date(date).setHours(0,0,0,0);

	      for (var i = 0; i < $scope.events.length; i++) {
	        var currentDay = new Date($scope.events[i].date).setHours(0,0,0,0);

	        if (dayToCheck === currentDay) {
	          return $scope.events[i].status;
	        }
	      }
	    }

	    return '';
	  }			
	  
	  // Disable weekend selection
	  function disabled(data) {
	    var date = data.date,
	      mode = data.mode;
	    return mode === 'day' && (date.getDay() === 0 || date.getDay() === 6);
	  }
  }]);	