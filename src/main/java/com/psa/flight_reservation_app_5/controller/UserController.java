package com.psa.flight_reservation_app_5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.psa.flight_reservation_app_5.entity.User;
import com.psa.flight_reservation_app_5.repository.UserRepository;

@Controller
public class UserController {
	@Autowired
	private UserRepository userRepo;

	@RequestMapping("/showLoginPage")
	public String showLoginPage() {
		return "login/login";
	}

	@RequestMapping("/showReg")
	public String showReg() {
		return "login/showReg";
	}

	@RequestMapping("/saveReg")
	public String saveReg(@ModelAttribute("user") User user) {
		userRepo.save(user);
//		System.out.println(user.getFirstNane()+" "+user.getLastName());
		return "login/login";
	}

	@RequestMapping("/verifyLogin")
	public String verifyLogin(@RequestParam("emailId") String emailId,@RequestParam("password") String password,ModelMap modelMap ) {
//		System.out.println(emailId+" "+password);

		User user = userRepo.findByEmail(emailId);
		if(user!=null) {
			if(user.getEmail().equals(emailId)&&user.getPassword().equals(password)) {
				return "findFlights";
			}
			else {
				modelMap.addAttribute("error","invalid username/ password");
				return "login/login";
			}
		}else
		{
			modelMap.addAttribute("error","invalid username/ password");
			return "login/login";
		}

	}

}
