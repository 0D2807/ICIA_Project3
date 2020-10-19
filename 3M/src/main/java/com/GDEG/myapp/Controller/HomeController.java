package com.GDEG.myapp.Controller;


import java.util.Locale;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/")
	public String home(Locale locale, Model model) {
		
		return "main";
	}
	
	@RequestMapping(value = "/reportWrite")
	public String report() {		
		return "reportWrite";
	}
	
}
