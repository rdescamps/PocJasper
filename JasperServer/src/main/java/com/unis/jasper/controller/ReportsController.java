package com.unis.jasper.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.unis.jasper.service.GenerateReport;

import net.sf.jasperreports.engine.JRException;

@Controller
public class ReportsController {
	
	private String name;

	@RequestMapping(path = "/calendar", method = RequestMethod.GET)
	public ResponseEntity<byte[]> reportsStatisticOrders(HttpServletRequest request) {
	        Map<String, Object> parameters = new HashMap<>();
	        
	        
	        
	        
	        
	        byte[] bytes = null;
			try {
				bytes = GenerateReport.Generate("CalendarPrincipal", parameters, null);
			} catch (JRException e) {
				e.printStackTrace();
			}
	    return ResponseEntity
	            .ok()
	            .header("Content-Type", "application/pdf; charset=UTF-8")
	            .header("Content-Disposition", "inline; filename=\"" + name + ".pdf\"")
	            .body(bytes);


	}

}
