<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<c:set var="context" value="${pageContext.servletContext.contextPath}" />
<c:set var="baseURL"
	value="${fn:replace(pageContext.request.requestURL, pageContext.request.requestURI, pageContext.request.contextPath)}" />

<nav class="navbar navbar-default navbar-static-top"
	style="background-color: #EA894B; height: 13% !important">
	<div class="container-fluid" style="padding: 0.5%">
		<div class="col-md-1 col-md-offset-1 removePaddingLeftRignht">
			<img src="static/images/logo.png" height="75px" width="75px" />
		</div>
		<div class="col-md-5 removePaddingLeftRignht">
			<h1>Trucking</h1>
		</div>
		<div class="col-md-5 removePaddingLeftRignht pull-right"
			style="margin-top: 1.1% !important"">
			
		</div>
		<div class="col-md-2 removePaddingLeftRignht pull-right"
			style="color: white;>
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target=".navbar-collapse">
				<span class="sr-only"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span> <span class="icon-bar"></span>
			</button>
		</div>
	</div>
</nav>


<script type="text/javascript">
	$(document).ready(function() {

		

	});
</script>