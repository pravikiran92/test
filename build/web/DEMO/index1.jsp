<%-- 
    Document   : search
    Created on : Feb 15, 2021, 4:27:56 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Search Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">
</head>
<body>
<div class="container">
<form class="form-inline" method="post" action="search.jsp">
<input type="text" name="sno" class="form-control" placeholder="Search roll no..">
<button type="submit" name="save" class="btn btn-primary">Search</button>
</form>
</div>
</body>
</html>
