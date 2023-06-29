package com.psa.flight_reservation_app_5.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.psa.flight_reservation_app_5.entity.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {

	@Query("from Flight where departureCity=:departureCity and arrivalCity=:arrivalCity and dateOfDeparture=:dateOfDeparture")

//	from flights.flight where departure_City=:departureCity' and arrival_City=:arrivalCity and date_of_departre=:departureDate


	List<Flight> findFlights(@Param("departureCity") String from, @Param("arrivalCity") String to,@Param("dateOfDeparture") Date dateOfDeparture);

}
