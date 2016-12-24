<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Livre</title>
</head>
<body>
<div id="formRecherche">
<form action="Controleur" method="post">
<table>
<tr>
<td>Code livre</td>
<td><input type="number" name="code" value="${ID_Livre}" required="required"></td>
<td>${errCode}</td>
<td><input type="submit" name="action" value="Consulter"></td>
<td><input type="submit" name="action" value="ToutLivres"></td>
</tr>
</table>
</br></br>
<table width="850" height="200" border="1">
<tr> <th width="118">codeLivre</th>  
<th width="305"> Nom livre</th>
 <th width="149">  Nom auteur</th> 
  <th width="149"> Date d'appartition</th> 	
  <th width="149">  Prix</th></tr>
<c:forEach items="${Livre}" var="l">
<tr  align="center">
<td >${l.ID_Livre}</td><td>${l.titre}</td><td>${l.nomAuteur}</td><td>${l.dateAppartition}</td><td>${l.prix}</td>
</tr>
</c:forEach>
</table>
</form>
</div>
</body>
</html>