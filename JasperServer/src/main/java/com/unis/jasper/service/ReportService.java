package com.unis.jasper.service;

import java.io.File;
import java.net.URISyntaxException;

import org.springframework.stereotype.Component;

@Component
public class ReportService {

	final static String folder = "/reports";

	public static boolean jrxmlFileExists(String file) {
		File f = new File("src/main/resources/reports/" + file + ".jrxml");
		if (f.exists() && !f.isDirectory()) {
			return true;
		}
		return false;
	}

	public static boolean jasperFileExists(String file) {
		File f = new File("src/main/resources/reportsCompile/" + file + ".jasper");
		if (f.exists() && !f.isDirectory()) {
			return true;
		}
		return false;
	}

	public static String loadJrxmlFile(String file) {
		String path = "src/main/resources/reports/" + file + ".jrxml";
		return path;
	}

	public static File loadJasperFile(String file) throws URISyntaxException {
		File path = new File("src/main/resources/reportsCompile/" + file + ".jasper");
		return path;
	}

}