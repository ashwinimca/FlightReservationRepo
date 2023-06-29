package com.psa.flight_reservation_app_5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.psa.flight_reservation_app_5.dto.ReservationRequest;
import com.psa.flight_reservation_app_5.entity.Reservation;
import com.psa.flight_reservation_app_5.service.ReservationService;

@Controller
public class ReservationController {

	@Autowired
	private ReservationService reservationService;

	@RequestMapping("/confirmReservation")
	public String confirmReservation(ReservationRequest reservation,ModelMap modelMap) {
		Reservation reservationId=reservationService.bookFlight(reservation);

		modelMap.addAttribute("reservationId",reservationId);
		return "confirmReservation";
	}
}
