<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Registration</title>
</head>
<body>
	<fieldset>
		<legend>
			<h2>Create New Account</h2>
		</legend>
		<form action="saveReg" method="post">
			
		First Name <input type="text" name="firstName" /><br>
		Last Name <input type="text" name="lastName" /><br>
		Email <input type="text" name="email" /><br>
		Password <input type="text" name="password" /><br>
		<input type="submit" value="save" /><br>
	
	
		</form>
	</fieldset>
</body>
</html>