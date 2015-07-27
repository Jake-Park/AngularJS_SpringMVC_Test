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