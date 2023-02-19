<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calculator</title>
</head>
<center>
<body>
	<h2>Simple Calculator</h2>
	<form action="MyCalcee" method="post">
	<input placeholder="Enter Num1" name="num1"/></br></br>
	<input placeholder="Enter Num2" name="num2"/></br></br>
	<input type="submit" name="oprt" value="+">
	<input type="submit" name="oprt" value="-">
	<input type="submit" name="oprt" value="*">
	<input type="submit" name="oprt" value="/">
	<input type="submit" name="oprt" value="%">
	</form>
</body>
</center>
</html>