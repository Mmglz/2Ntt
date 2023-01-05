<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.nttdata.tomcat.*"%>
<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="ISO-8859-1">
	<title>FP Dual NTT DATA - JSP</title>
	<style>
		h1{
			text-align:center;
		}
		p{
			color: #6485c1;
		}
		.negrita{
			font-weight: bold;
		}
	</style>
</head>
<body>
	<h1>Primer JSP de la Dual</h1>
	
	<p>
	<%
	for (int i=1; i <= 3; i++){
		out.println("A la de " + i + "...");
	}
	%>
	</p>
	
	<p class="negrita"> <%= NTTDataJSP.helloNTTDataDual("Manoli!") %></p>
</body>
</html>