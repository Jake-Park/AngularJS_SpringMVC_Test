    app.factory('PaginatonService', function($rootScope) {
	     return {
	  	       Pagination: function(totalRecord, $rootScope) {
	  	         return new Pagination(totalRecord);
	  	       }
	  	     };
	  	});  
  	
  	var Pagination = function(totalRecord, maxPageCount, $rootScope) { 		
  		if(maxPageCount == undefined) {
  			maxPageCount = 100;
  		}
	    this.maxPageCount = maxPageCount;
	    this.totalRecord = totalRecord;
	    this.counter = 1;
	    
	    //console.log("counter : " + this.counter);
	    //console.log(", maxPageCount : " + ((this.counter * 10) < totalRecord));
	     
	    this.max = function() {
	        return this.maxPageCount;
	    };
	    this.setCurrent = function(counter) {
	        this.counter = counter;
	    };
	    this.current = function() {
	        return this.counter;
	    };
	    this.next = function() {
	        if (this.hasNext()) {
	            this.counter++;
	            //$rootScope.broadcast("pagination:next");
	        }
	    };
	    this.previous = function() {
	        if (this.hasPrevious()) {
	            this.counter--;
	            //$rootScope.broadcast("pagination:previous");
	        }
	    };
	    this.hasPrevious = function() {
	        return this.counter > 1;
	    };
	    this.hasNext = function() {
	        return (this.counter < this.maxPageCount)
	        	&& (this.counter * 10) < totalRecord;
	    };
	    this.hasList = function(pageIndex) {
	    	return pageIndex < 1 || (pageIndex != 1 && ((pageIndex-1) * 10) >= this.totalRecord);
	    };
	};  	