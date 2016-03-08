<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="context" value="${pageContext.request.contextPath}" />
<!doctype html>
<html>
  <head>
  	<title>SmartLink</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    <link href='https://fonts.googleapis.com/css?family=Roboto:400,700,300,900' rel='stylesheet'>
    <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap-glyphicons.css" rel="stylesheet">   
    <link href="<%=request.getContextPath()%>/css/bootstrap/bootstrap.min.css" rel="stylesheet" />
    <link href="<%=request.getContextPath()%>/css/admin/dashboard.css" rel="stylesheet"/>
    <link href="<%=request.getContextPath()%>/css/admin/admin.css" rel="stylesheet"/>    
    
    
    <script src="//code.jquery.com/jquery-1.11.3.js"></script>
    <script src="<%=request.getContextPath()%>/js/bootstrap.min.js"></script>
    <script src="<%=request.getContextPath()%>/js/angular/angular.min.js"></script>
    <script src="<%=request.getContextPath()%>/js/asset/ui-bootstrap-tpls-0.13.4.min.js"></script>  
    <script src="https://code.angularjs.org/1.2.28/angular-route.min.js"></script>
    <script src="//ajax.googleapis.com/ajax/libs/angularjs/1.2.19/angular-cookies.js"></script>
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
    <%=request.getContextPath()%>
    <footer></footer>
    <layer></layer>
    
   	<!-- Util -->
   	<script src="<%=request.getContextPath()%>/js/util.js"></script>
    <!-- Modules -->
    <script src="<%=request.getContextPath()%>/js/angular/app.js"></script>
    <!-- Controllers -->
    <script src="<%=request.getContextPath()%>/js/angular/controller/LoginController.js"></script>
    <script src="<%=request.getContextPath()%>/js/angular/controller/RetryController.js"></script>
    <script src="<%=request.getContextPath()%>/js/angular/controller/LogDetailController.js"></script>
    <!-- Directives -->
    <script src="<%=request.getContextPath()%>/js/angular/directive.js"></script>
    <!-- Pagination -->
    <script src="<%=request.getContextPath()%>/js/angular/pagination.js"></script>
  </body>
</html>