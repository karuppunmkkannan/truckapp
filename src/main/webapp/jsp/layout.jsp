
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<c:set var="context" value="${pageContext.servletContext.contextPath}" />
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title><tiles:insertAttribute name="title" ignore="true" /></title>

<link rel="stylesheet" type="text/css"
	href="${context}/static/bootstrap-3.3.6/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" type="text/css"
	href="${context}/static/css/styles.css">
<link rel="stylesheet" type="text/css"
	href="${context}/static/font-awesome-4.7.0/css/font-awesome.css">
<link rel="stylesheet" type="text/css"
	href="${context}/static/datatables/css/jquery.dataTables.css">
<link rel="stylesheet" type="text/css"
	href="${context}/static/datatables/feature/fixedColumns.dataTables.css">

<!--[if IE]>
    <script src="${context}/resources/external/iedist/html5shiv.min.js"></script>
    <script src="${context}/resources/external/iedist/respond.min.js"></script>
    <script src="${context}/resources/external/iedist/css3-mediaqueries.js"></script>
<![endif]-->

</head>
<body>

	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/sockjs-client/1.1.4/sockjs.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/stomp.js/2.3.3/stomp.js"></script>

	<script src="${context}/static/jquery/jquery-2.2.0.min.js"></script>
	<script src="${context}/static/jquery/jquery.cookie.js"></script>
	<script src="${context}/static/jquery/Chart.min.js"></script>
	<script src="${context}/static/bootstrap-3.3.6/js/bootstrap.min.js"></script>
	<script src="${context}/static/javascript/script.js"></script>
	<script src="${context}/static/datatables/js/jquery.dataTables.js"></script>

	<tiles:insertAttribute name="header" />
	<tiles:insertAttribute name="menu" />
	<tiles:insertAttribute name="body" />
	<tiles:insertAttribute name="footer" />


</body>
</html>
