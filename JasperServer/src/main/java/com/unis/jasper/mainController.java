
package com.unis.jasper;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class mainController {
 
    
	@RequestMapping(value = {"/delete"}, method = RequestMethod.GET)
	public void delete(){
		JasperServerApplication.deleteDirectory("src/main/resources/reportsCompile/" );
	}

 
    @RequestMapping(value = { "/", "/test" }, method = RequestMethod.GET)
    public String test(Model model) {
 
        String message = "Hello Spring Boot + JSP";
 
        model.addAttribute("message", message);
 
        return "test";
    }
    
}
 