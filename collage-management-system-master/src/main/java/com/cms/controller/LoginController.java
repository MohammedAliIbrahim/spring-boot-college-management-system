
package com.cms.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cms.entity.User;
import com.cms.services.UserServices;

@Controller
public class LoginController {

	@Autowired UserServices userServices;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginForm() {
		return "login";
	}
	
	//login
	@RequestMapping(value = "/login", method = RequestMethod.POST)
    public String verifyLogin(@RequestParam int id, 
    		@RequestParam String password, HttpSession session, Model model) {
        
		
		User user = userServices.loginUser(id, password);
		if (user == null) {
			model.addAttribute("loginError", "Error logging in. Please try again");
			return "login";
		}
		session.setAttribute("loggedInUser", user);
        return "redirect:/";
    }
	
	
	//logout
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		session.removeAttribute("loggedInUser");
		return "login";
	}
	
}
