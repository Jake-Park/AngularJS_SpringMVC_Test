    app.factory('PaginatonService', function($rootScope) {
	     return {
	  	       Pagination: function(maxCount, $rootScope) {
	  	         return new Pagination(maxCount);
	  	       }
	  	     };
	  	});  
  	
  	var Pagination = function(totalRecord, maxPageCount, $rootScope) {
	    this.maxPageCount = maxPageCount;
	    this.totalRecord = totalRecord;
	    this.counter = 1;
	     
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
	        	&& (this.counter * 10) > total;
	    };
	};  	