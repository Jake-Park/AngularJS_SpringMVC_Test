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