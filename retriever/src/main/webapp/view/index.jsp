<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="context" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
  <head>
  	<title>C3 Gateway</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
    <link href="<%=request.getContextPath()%>/css/fonts/bootstrap-glyphicons.css" rel="stylesheet">   
    <link href="<%=request.getContextPath()%>/css/bootstrap/bootstrap.min.css" rel="stylesheet" />
    <link href="<%=request.getContextPath()%>/css/admin/dashboard.css" rel="stylesheet"/>
    <link href="<%=request.getContextPath()%>/css/admin/admin.css" rel="stylesheet"/>
      <link rel="stylesheet" href="http://ajax.googleapis.com/ajax/libs/angular_material/1.1.0-rc2/angular-material.min.css">
    
    <script src="<%=request.getContextPath()%>/js/asset/jquery-1.11.3.js"></script>
    <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
    <script src="<%=request.getContextPath()%>/js/bootstrap.min.js"></script>
    <script src="<%=request.getContextPath()%>/js/angular/angular.min.js"></script>
    <script src="<%=request.getContextPath()%>/js/asset/ui-bootstrap-tpls-1.2.4.min.js"></script>
    <script src="<%=request.getContextPath()%>/js/asset/angular-route.js"></script>
    <script src="<%=request.getContextPath()%>/js/asset/angular-cookies.js"></script>
    

  </head>
  <body ng-app="Admin">

  <!--  Header Menu  ng-show="isLogin()" -->
  <header-menu></header-menu>
    
    <div class="container">
      <div class="row well well-lg mg-t10">
		<!-- <left-menu ng-show="Auth.isLoggedIn() && !Auth.isMobile()"></left-menu> -->
           
      	<div ng-view></div>
      
      </div>
    </div>
    <footer></footer>
    <!-- <layer></layer> -->
 

    
   	<!-- Util -->
   	<script src="<%=request.getContextPath()%>/js/util.js"></script>
    <!-- Modules -->
    <script src="<%=request.getContextPath()%>/js/angular/app.js"></script>
    <!-- Controllers -->
    <script src="<%=request.getContextPath()%>/js/angular/controller/LoginController.js"></script>
    <script src="<%=request.getContextPath()%>/js/angular/controller/RetryController.js"></script>
    <script src="<%=request.getContextPath()%>/js/angular/controller/LogDetailController.js"></script>
    <script src="<%=request.getContextPath()%>/js/angular/controller/DashboardController.js"></script>
    <script src="<%=request.getContextPath()%>/js/angular/controller/AddController.js"></script>
    <!-- Directives -->
    <script src="<%=request.getContextPath()%>/js/angular/directive.js"></script>
  </body>


</html>