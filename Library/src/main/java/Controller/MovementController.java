package Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import Model.Book;
import Model.User;
import Service.EstirmeceService;
import Validator.FieldMatchValidator;




@Controller
public class MovementController{
	

	FieldMatchValidator fmv;

	@RequestMapping(value = "/rent-book", method = RequestMethod.GET)
	public ModelAndView rentBook() {
		ModelAndView modelv = new ModelAndView("rent-book");
		modelv.addObject("book",new Book());
		return modelv;
	}

	@RequestMapping(value = "/rent", method = RequestMethod.POST)
	public ModelAndView rent(@Valid @ModelAttribute("Book") Book book, BindingResult result) {
		
		ModelAndView modelAndView = new ModelAndView("books");
		modelAndView.addObject("book", book); 

		fmv.validate(book, result);
		 if (result.hasErrors())
			 modelAndView.setViewName("books");
	         
	     else 
	    	 modelAndView.setViewName("view");

		
		return modelAndView ;
		}
	

}