package xyz.agrishop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView("page");
		mav.addObject("title", "home");
		mav.addObject("userClicksHome",true);
		return mav;
	}
	
	@RequestMapping(value = "/aboutreq")
	public ModelAndView about() {
		ModelAndView mav = new ModelAndView("page");
		mav.addObject("title", "AboutUs");
		mav.addObject("userClicksAbout",true);
		System.out.println("mav obj: "+mav);
		return mav;
	}
	
	@RequestMapping(value = "/contactreq")
	public ModelAndView contact() {
		ModelAndView mav = new ModelAndView("page");
		mav.addObject("title", "ContactUs");
		mav.addObject("userClicksContact",true);
		return mav;
	}
	
}
