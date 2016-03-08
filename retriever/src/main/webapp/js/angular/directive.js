(function(){
    var app = angular.module('directives', []);
    
	app.directive("headerMenu", function() {
        return {
          restrict: 'E',
          templateUrl: "/view/include/header-menu.html"
        };
      });
    
    app.directive("leftMenu", function() {
        return {
          restrict: 'E',
          templateUrl: "/view/include/left-menu.html"
        };
      });

    app.directive("footer", function() {
        return {
          restrict: 'E',
          templateUrl: "/view/include/footer.html"
        };
      });
    
	app.directive("layer", function() {
        return {
          restrict: 'E',
          templateUrl: "/view/include/layer.html"
        };
      });
	
	app.directive("pagination", function() {
        return {
          restrict: 'E',
          templateUrl: "/view/include/pagination.html"
        };
      });
 })();    