package com.psa.flight_reservation_app_5;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.psa.flight_reservation_app_5.entity.User;

@SpringBootTest
class FlightReservationApp5ApplicationTests {

	@Autowired
	User user;
	
	@Test
	void contextLoads() {
		System.err.println(user);
	}
	
	
	

}
