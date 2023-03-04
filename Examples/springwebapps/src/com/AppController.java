package com;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/v1")
public class AppController {

	// URL : context-path/spring/v1/index
	@RequestMapping(method = RequestMethod.GET, path = "/index")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView("home", "date", LocalDateTime.now());
		return mav; // ViewResolver -> /WEB-INF/pages/home.jsp
	}
}
