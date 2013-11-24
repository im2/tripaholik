package com.source.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class test {

	@RequestMapping(value="/welcome")
	public String printWelcome(ModelMap model) { 
		model.addAttribute("message", "Spring 3 MVC Hello World");
		return "home";
 
	}
	//
	@RequestMapping(value = "/addContact", method = RequestMethod.POST)
    public String addContact(@ModelAttribute("contact")
                            Contact contact, BindingResult result) {
         
        contact.setfirstname("firstname");
		System.out.println("First Name:" + contact.getfirstname() +
                    "Last Name:" + contact.getlastname());
         
        return "redirect:contacts.do";
    }
     
    @RequestMapping("/contacts")
    public ModelAndView showContacts() {
    	
    	//System.out.print(new Contact());
         
        return new ModelAndView("contact", "command", new Contact());
    }
}