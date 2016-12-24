<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Promotion</title>
</head>
<body>
<div id="formRecherche">
<form action="Controleur2" method="post">
<table>
<tr>
<td>Code Promotion</td>
<td><input type="number" name="code" value="${idPromotion}" required="required"></td>
<td>${errCode}</td>
<td><input type="submit" name="action" value="Consulter"></td>
<td><input type="submit" name="action" value="ToutPromotion"></td>
</tr>
</table>
</br></br>
<table  width="850" height="200" border="1">
<tr><th width="149">Code Promotion</th><th width="149">Date debut</th><th width="149">Date fin</th></tr>
<c:forEach items="${Promotion}" var="l">
<tr align="center">
<td>${l.idPromotion}</td><td>${l.dateDebut}</td><td>${l.dateFin}</td>
</tr>
</c:forEach>
</table>
</form>
</div>
</body>
</html>