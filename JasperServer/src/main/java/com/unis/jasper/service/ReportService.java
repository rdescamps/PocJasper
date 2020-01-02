package com.unis.jasper.service;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.stereotype.Component;



@Component
public class ReportService {




final static String folder = "/reports";

public static boolean jrxmlFileExists(String file) {

    String tmpPath = folder + "/" + file + ".jrxml";
    URL url = ReportService.class.getResource(tmpPath);
    File reportfile;
    try {
        reportfile = new File(url.toURI().getPath());

        System.out.println("PATH reportfile jasperFileExists: " + reportfile.getAbsolutePath());
        System.out.println("PATH reportfile.getAbsolutePath() : " + reportfile.getAbsolutePath());
        return true;
    } catch (URISyntaxException ex) {
        Logger.getLogger(GenerateReport.class.getName()).log(Level.SEVERE, null, ex);

    }
    return false;
}

public static boolean jasperFileExists(String file) {

    String tmpPath = folder + "/" + file + ".jasper";
    URL url = ReportService.class.getResource(tmpPath);
    File reportfile;
    if (url == null) {
        return false;
    } else {
        try {
            reportfile = new File(url.toURI().getPath());
            System.out.println("PATH jasperFileExists reportfile: " + reportfile);
            System.out.println("PATH jasperFileExists reportfile.getAbsolutePath() : " + reportfile.getAbsolutePath());

        } catch (URISyntaxException ex) {
            Logger.getLogger(GenerateReport.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

}

public static String loadJrxmlFile(String file) {
    try {
		String x = new File(".").getCanonicalPath();
		System.out.println("chemin en moment de load JRXML : = " + x);
	} catch (IOException e1) {
		e1.printStackTrace();
	}
    
    
    String path = "";
    String tmpPath = folder + "/" + file + ".jrxml";
    URL url = ReportService.class.getResource(tmpPath);
    try {
        path = URLDecoder.decode(url.getPath(), "UTF-8");
    } catch (UnsupportedEncodingException e) {
       
    }
    return path;

}

public static File loadJasperFile(String file) throws URISyntaxException {

    String tmpPath ="/src/main/resources/reports/" + file + ".jasper";
    URI url = new URI(tmpPath);
    System.out.println(tmpPath);
    
    
    File reportfile = null;
    try {
		String x = new File(".").getCanonicalPath();
		System.out.println("chemin actuel pour chargement jasper file : = " + x);
	} catch (IOException e1) {
		e1.printStackTrace();
	}
    System.out.println();
   
    
    reportfile = new File(file + ".jasper");

    return reportfile;
}

}