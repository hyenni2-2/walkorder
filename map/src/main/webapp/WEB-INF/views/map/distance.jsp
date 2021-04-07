<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Home | Triangle</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/font-awesome.min.css" rel="stylesheet">
    <link href="css/animate.min.css" rel="stylesheet"> 
    <link href="css/lightbox.css" rel="stylesheet"> 
   <link href="css/main.css" rel="stylesheet">
   <link href="css/responsive.css" rel="stylesheet">
   <link href="css/map.css" rel="stylesheet">

    <!--[if lt IE 9]>
       <script src="js/html5shiv.js"></script>
       <script src="js/respond.min.js"></script>
    <![endif]-->       
    <link rel="shortcut icon" href="images/ico/favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="images/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="images/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="images/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="images/ico/apple-touch-icon-57-precomposed.png">
     
</head><!--/head-->

<body>
      
    <!-- 헤더 -->
   <%@ include file="/WEB-INF/views/include/header.jsp"%>

    <!-- 카카오맵 API 설정 -->
    <script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=b04f710e2f3086922488a5fe2301c858"></script>
    <div class="mapWrapper">
    	<div id="map"></div>
    	<div id="distance">
    	
    	<div class="well well-sm">
    		<ul>
    		<li>거리 : {result.distance}</li>
    		<li>포인트 : {result.point}</li>
    		</ul>
    	</div>
    	
    	
    	</div>
    </div>
            
           
            
    
    <!-- 푸터 -->
    <%@ include file="/WEB-INF/views/include/footer.jsp"%>

    <script type="text/javascript" src="js/jquery.js"></script>
    <script type="text/javascript" src="js/bootstrap.min.js"></script>
    <script type="text/javascript" src="js/lightbox.min.js"></script>
    <script type="text/javascript" src="js/wow.min.js"></script>
    <script type="text/javascript" src="js/map.js"></script> 
   
  	 
    
      
</body>
</html>