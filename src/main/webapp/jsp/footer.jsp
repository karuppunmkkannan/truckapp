<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<c:set var="context" value="${pageContext.servletContext.contextPath}" />
<c:set var="baseURL"
	value="${fn:replace(pageContext.request.requestURL, pageContext.request.requestURI, pageContext.request.contextPath)}" />

<nav class="navbar navbar-default navbar-fixed-bottom"
	style="background-color: #EA894B" id="footerDiv"></nav>

<script type="text/javascript">
	$(document).ready(function() {

	});
</script>
