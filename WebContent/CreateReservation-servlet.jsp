<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Enregister Reservation 1</title>
</head>
<form method="post" action="AddReservationServlet">
	<table>
		<tr>
			<th><h2>Veuillez insérer les détails des Voyageurs</h2></th>
		</tr>
		<tr>
			<td><i>Civilite: <input type="text" name="civilite"
					size="25"></i></td>
		</tr>
		<tr>
			<td><i>First Name: <input type="text" name="prenom"
					size="25"></i></td>
		</tr>
		<tr>
			<td><i>Last Name: <input type="text" name="nom" size="25"></i></td>
		</tr>
		<tr>
			<td><i>Email: <input type="text" name="email" size="25"></i></td>
		</tr>
		<tr>
			<td><i>Numero de lapiece d'identite: <input type="text"
					name="numeroPieceIdentite" size="25"></i></td>
		</tr>
		<tr>
			<td><i>Age: <input type="text" name="age" size="25"></i></td>
		</tr>
		<tr>
			<td>
				
					<input class="button" type="submit" name="button"
						value="Add Voyageur" /><input
						class="button" name="button" type="reset" value="Reset">
			</td>
		</tr>
	</table>
</form>

<form method="post" action="AddReservationServlet">
	<table>
		<tr>
			<th><h2>valider votre reservation</h2></th>
		</tr>
		<tr>
			<td>
				<input class="button" type="submit"
						name="button" value="Validate Reservation"><input
						name="button" class="button" type="reset" value="Reset">
			</td>
		</tr>
	</table>
</form>

</html>