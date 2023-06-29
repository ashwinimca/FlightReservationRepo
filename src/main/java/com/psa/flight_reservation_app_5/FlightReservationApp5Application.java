package com.psa.flight_reservation_app_5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FlightReservationApp5Application {

	public static void main(String[] args) {
		SpringApplication.run(FlightReservationApp5Application.class, args);

//		Configuration cfg = new Configuration().configure().addAnnotatedClass(User.class).addAnnotatedClass(Flight.class).addAnnotatedClass(AbstractEntity.class).addAnnotatedClass(Passenger.class).addAnnotatedClass(Reservation.class);
//		SessionFactory sf = cfg.buildSessionFactory();
//		Session session = sf.openSession();
//		Transaction t = session.beginTransaction();
//

	}

}
