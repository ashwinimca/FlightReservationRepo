<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reservation Details</title>
</head>
<body>
	<h2>Flight Details</h2>
	Flight Number: ${flight.flightNumber}<br>
	Operating Airlines: ${flight.operatingAirline}<br>
	Departure City: ${flight.departureCity}<br>
	Arrival City: ${flight.arrivalCity}<br>
	Departure Date: ${flight.dateOfDeparture}<br>
	
	<fieldset>
	<legend><h2>Enter Passenger Details</h2></legend>
		<form action="confirmReservation" method="post">
			First Name<input type="text" name="firstName"/><br>
			Last Name<input type="text" name="lastName"/><br>
			Middle Name<input type="text" name="middleName"/><br>
			Email<input type="text" name="email"/><br>
			Phone<input type="text" name="phone"/><br>
			<input type="hidden" name="flightId" value="${flight.id}">
			<h2>Card Details</h2>
			Card Number<input type="text" name="cardNumber"/><br>
			Card Holder Name<input type="text" name="cardHolderName"/><br>
			Expiry Date<input type="text" name="expirationDate"/><br>
			CVV Code<input type="text" name="cvvCode"/><br>
			
			<input type="submit" value="Complete Reservation"/><br>
	
		</form>
	</fieldset>
</body>
</html>