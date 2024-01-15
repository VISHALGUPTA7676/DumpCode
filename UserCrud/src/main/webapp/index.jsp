<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.4.min.js"></script>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
s
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
<style type="text/css">
.error {
	color: red;
}
</style>



</head>
<body>
<h1>Hello</h1>
${stateDetails}
<%=request.getAttribute("countryDetails") %>






<input type="date"> 








<script >

$(document).ready(function() {
	
	loadDate();
	function loadDate(){
		alert("nn")
	};
});

</script>
</body>
</html>