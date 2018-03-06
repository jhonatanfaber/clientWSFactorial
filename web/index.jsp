<%-- 
    Document   : index
    Created on : 06-mar-2018, 13:49:42
    Author     : Jfaber
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Factorial!</h1>
    </body>    <%-- start web service invocation --%><hr/>
    <form action="index.jsp">
        Escriba un numero: <input type="text" name="number">
        <input type="submit" value="aceptar">
    </form>
        <%-- start web service invocation --%><hr/>
    <%
    try {
	ws.WebServiceFactorial_Service service = new ws.WebServiceFactorial_Service();
	ws.WebServiceFactorial port = service.getWebServiceFactorialPort();
	 int number = Integer.parseInt(request.getParameter("number"));
	
	// TODO process result here
	int result = port.factorial(number);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

    
</html>
