<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="my" %>     
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
body{
	background-color: lightYellow;
}

</style>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">  
<meta charset="ISO-8859-1">
<title>Register App</title>
</head>
<body>
	<h3 class="text-success">${msg}</h3>	
	
	<h2 class="h2 text-center text-secondary">Welcome TO PassPort  Registration</h2>
<div class="container">
 <my:form action="save" method="post" modelAttribute="person" cssClass="form-group">
 	<label class="h4 text-info">Enter First Name:*required</label>
 	<my:input path="firstName"	 cssClass="form-control" placeholder="Enter your first Name" />
 	
 	<label class="h4 text-info">Enter Last Name:*required</label>
 	<my:input path="lastName"	 cssClass="form-control" placeholder="Enter your Last Name"/>
 	
 	<label class="h4 text-info">Enter Sur Name:</label>
 	<my:input path="surName" cssClass="form-control" placeholder="Enter your  Sur Name"/>
 	
    <label class="h4 text-info">Enter  Date of Birth :*required</label>
 	<my:input path="date" cssClass="form-control date" placeholder="Enter your DOB Must be (yyyy-MM-dd) ex:2000-09-20"/>
 	
 		
 	<label class="h4 text-info">Enter Birth certificate Number:*required</label>
 	<my:input path="bcert"	 cssClass="form-control" placeholder="Enter Certificate number "/>
 	
 	
 	<label class="h4 text-info">Enter City Name:</label>
 	<my:input path="cityName" cssClass="form-control" placeholder="Enter City Name"/>
 	
 	<input type="submit" value="Register" class="btn btn-outline-success btn-lg"/>
 	<input type="reset" value="clearData" class="btn btn-outline-warning btn-lg"/>
 </my:form>		
</div>
</body>
</html>