<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Contact</title>
</head>
<form method="post" action="DeleteContactServlet">
	<table>
		<tr>
			<th><h2>Veuillez ins�rer l'id du contact � supprimer</h2></th>
		<tr>
			<td><i>Id: <input type="text" name="id" size="25"></i></td>
		</tr>
		<tr>
			<td><input class="button" type="submit" value="Submit" /><input
				class="button" type="reset" value="Reset"></td>
		</tr>

	</table>
</form>
</html>