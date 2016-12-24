<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Editeur</title>
</head>
<body>
<div id="formRecherche">
<form action="Controleur3" method="post">
<table>
<tr>
<td>Code Editeur</td>
<td><input type="number" name="code" value="${idEditeur}" required="required"></td>
<td>${errCode}</td>
<td><input type="submit" name="action" value="Consulter"></td>
<td><input type="submit" name="action" value="ToutEditeur"></td>
</tr>
</table>
</br></br>
<table  width="850" height="200" border="1">
<tr><th width="149">Code Editeur</th><th width="149">Nom Editeur</th></tr>
<c:forEach items="${Editeur}" var="l">
<tr align="center">
<td>${l.idEditeur}</td><td>${l.nomEditeur}</td>
</tr>
</c:forEach>
</table>
</form>
</div>
</body>
</html>