package com.psa.flight_reservation_app_5.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.psa.flight_reservation_app_5.entity.Reservation;
import com.psa.flight_reservation_app_5.repository.Reservationrepository;

@RestController
public class ReservationRestController {

	@Autowired
	private Reservationrepository reservationrepo;
//	private Optional<Reservation> findById;

	@RequestMapping("reservation/{id}")
	public Reservation findReservation(@PathVariable("id") Long id) {
		System.err.println("findReservation Enter");
		Optional<Reservation> findById = reservationrepo.findById(id);
		Reservation reservation = findById.get();
		System.err.println("findReservation Exit");
		return reservation;
	}
	@PostMapping("reservation")//@RequestMapping Also Work
	public Reservation updateReservation(@RequestBody Reservation  reservation) {
		long id = reservation.getId();
		Optional<Reservation> findById = reservationrepo.findById(id);
		Reservation reservation1 = findById.get();
		reservation.setFlight(reservation1.getFlight());
		reservation.setPassenger(reservation1.getPassenger());
		
		
		System.err.println("putReservation Enter");
		return reservationrepo.save(reservation);
	}
}
