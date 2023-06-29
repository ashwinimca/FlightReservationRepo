package com.psa.flight_reservation_app_5.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psa.flight_reservation_app_5.dto.ReservationRequest;
import com.psa.flight_reservation_app_5.entity.Flight;
import com.psa.flight_reservation_app_5.entity.Passenger;
import com.psa.flight_reservation_app_5.entity.Reservation;
import com.psa.flight_reservation_app_5.repository.FlightRepository;
import com.psa.flight_reservation_app_5.repository.PassengerRepository;
import com.psa.flight_reservation_app_5.repository.Reservationrepository;
import com.psa.flight_reservation_app_5.utilities.EmailUtil;
import com.psa.flight_reservation_app_5.utilities.PDFGenerator;

@Service
public class ReservationServiceImpl implements ReservationService {


	@Autowired
	PDFGenerator pdfGenerator;
	@Autowired
	EmailUtil emailUtil;
	@Autowired
	private PassengerRepository passengerRepo;
	@Autowired
	private FlightRepository flightRepo;
	@Autowired
	private Reservationrepository reservationRepo;

	@Override
	public Reservation bookFlight(ReservationRequest request) {



		Passenger passenger=new Passenger();
		passenger.setFirstName(request.getFirstName());
		passenger.setLasttName(request.getLastName());
		passenger.setMiddletName(request.getMiddleName());
		passenger.setEmail(request.getEmail());
		passenger.setPhone(request.getPhone());
		passengerRepo.save(passenger);

		long flightId = request.getFlightId();
		Optional<Flight> findById = flightRepo.findById(flightId);
		Flight flight = findById.get();

		Reservation reservation=new Reservation();
		reservation.setPassenger(passenger);
		reservation.setFlight(flight);
		reservation.setCheckedIn(false);
		reservation.setNumberOfBags(0);
		reservationRepo.save(reservation);

//		pdf.generatePDF(filePath+reservation.getId()+".pdf",request.getFirstName(),request.getEmail(), request.getPhone(),flight.getOperatingAirline(), flight.getDateOfDeparture(), flight.getDepartureCity(), flight.getArrivalCity());
//		pdf.generatePDF(filePath, filePath, filePath, filePath, filePath, filePath, filePath, filePath);

		String filePath="D:\\codingsamples\\flight_reservation_app_5\\tickets\\reservation"+reservation.getId()+".pdf";
		pdfGenerator.generateItinerary(reservation,filePath);
		emailUtil.sendItinerary(passenger.getEmail(),filePath);

		return reservation;

	}

}
