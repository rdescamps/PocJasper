
package com.unis.jasper;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class mainController {
 
    
 

 
    @RequestMapping(value = { "/", "/test" }, method = RequestMethod.GET)
    public String test(Model model) {
 
        String message = "Hello Spring Boot + JSP";
 
        model.addAttribute("message", message);
 
        return "test";
    }
    
}
 