package xyz.agrishop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import xyz.agrishopbackend.dao.CategoryDAO;
import xyz.agrishopbackend.dto.CategoryDTO;

@Controller
public class PageController {
	@Autowired
	private CategoryDAO categoryDAORepo;

	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView("page");
		mav.addObject("title", "home");
		//passing the list of categories
		mav.addObject("categories", categoryDAORepo.list());
		mav.addObject("userClicksHome",true);
		return mav;
	}
	
	@RequestMapping(value = "/aboutreq")
	public ModelAndView about() {
		ModelAndView mav = new ModelAndView("page");
		mav.addObject("title", "About Us");
		mav.addObject("userClicksAbout",true);
		System.out.println("mav obj: "+mav);
		return mav;
	}
	
	@RequestMapping(value = "/contactreq")
	public ModelAndView contact() {
		ModelAndView mav = new ModelAndView("page");
		mav.addObject("title", "Contact Us");
		mav.addObject("userClicksContact",true);
		return mav;
	}
	/*Methods to loaad all products
	 * */
	@RequestMapping(value = "/show/all/products")
	public ModelAndView showAllProducts() {
		ModelAndView mav = new ModelAndView("page");
		mav.addObject("title", "All Products");
		mav.addObject("categories", categoryDAORepo.list());
		mav.addObject("userClicksAllProducts",true);
		System.out.println("mav obj: "+mav);
		return mav;
	}
	@RequestMapping(value = "/show/category/{id}/products")
	public ModelAndView showCategoryProducts(@PathVariable( "id") int id) {
		ModelAndView mav = new ModelAndView("page");
		//categoryDAO to fetch single category
		CategoryDTO categoryDTO=null;
		categoryDTO=categoryDAORepo.get(id);
		mav.addObject("title", categoryDTO.getName());
		//passing the list of categories
		mav.addObject("categories",categoryDAORepo.list());
		//passing single categoryDTO object
		mav.addObject("categoryDTO",categoryDTO);
		
		mav.addObject("userClicksCategoryProducts",true);
		System.out.println("mav obj: "+mav);
		return mav;
	}
	
}
