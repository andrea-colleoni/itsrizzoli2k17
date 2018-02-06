<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ciclo 200</title>
</head>
<body>
<h1>Ciclo di 200 iterazioni</h1>
<% for(int i = 0; i < 200; i++) { 
	String color = "";
	if (Math.random() > 0.5)
		color = "red";
	else
		color = "green";%>
 <h2 style="color:<%= color%>">Valore di i: <%= i %></h2>
 <button onclick="console.log('pulsante <%= i %> di colore <%= color %>')">Cliccami!</button>
<% } %>
</body>
</html>