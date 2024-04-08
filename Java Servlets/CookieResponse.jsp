<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
String lang = "JavaScript";
Cookie [] myCookies = request.getCookies();
if( myCookies != null){
	for(Cookie cook : myCookies){
		if("myApp.language".equals(cook.getName())){
			lang = cook.getValue();
			break;
		}
	}
}

%>

<h2>Explore your Language
<%=lang%></h2>

<ul>

<li>React</li>
<li>Angular</li>
<li>Node</li>

</ul>


<h2>Explore your Language
<%=lang%></h2>

<ul>

<li>JavaScript with Types</li>
<li>Shows error on Compile Time</li>
<li>Is also Object Oriented</li>

</ul>

<h2>Explore your Language
<%=lang%></h2>

<ul>

<li>Fast as Compared to Python</li>
<li>Close to the Hardware</li>
<li>Used in Machine Learning</li>

</ul>


<hr>

<a href="cookiesform.html">Click to Redirect</a>

</body>
</html>