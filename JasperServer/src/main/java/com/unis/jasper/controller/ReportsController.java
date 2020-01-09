package com.unis.jasper.controller;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.unis.jasper.bean.CalendarPrincipal;
import com.unis.jasper.service.GenerateReport;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@Controller
public class ReportsController {
	
	private String name;

	@RequestMapping( value = "/calendar" , method = RequestMethod.POST )
	public ResponseEntity<byte[]> reportCalendar( @RequestBody CalendarPrincipal calendarPrincipal) throws URISyntaxException  {
	        Map<String, Object> parameters = new HashMap<>();	
	        ArrayList<String> fileName = new ArrayList<>();
	        fileName.add("CalendarPrincipal");
	        fileName.add("CalendarSubActivite"); 
	        
	        
	     // Populate this list of beans as per your requirements.
	        List<CalendarPrincipal> beansPrinc = new ArrayList<>();
	        beansPrinc.add(calendarPrincipal);
	     // Wrap the beans in a beans in a JRBeanCollectionDataSource.
	        JRBeanCollectionDataSource datasource = new JRBeanCollectionDataSource(beansPrinc);
	        byte[] bytes = null;
			try {
				bytes = GenerateReport.Generate(fileName, parameters, datasource);
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
