package com.unis.jasper.service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.util.JRSaver;

public class GenerateReport {

	public static byte[] Generate(String inputFileName, Map<String, Object> params, JRDataSource dataSource) throws JRException {

		byte[] bytes = null;
		JasperReport jasperReport = null;
		try (ByteArrayOutputStream byteArray = new ByteArrayOutputStream()) {
			// Check if a compiled report exists
			if (ReportService.jasperFileExists(inputFileName)) {
				jasperReport = (JasperReport) JRLoader.loadObject(ReportService.loadJasperFile(inputFileName));
			}
			// Compile report from source and save
			else {
				String jrxml = ReportService.loadJrxmlFile(inputFileName);
				jasperReport = JasperCompileManager.compileReport(jrxml);
				// Save compiled report. Compiled report is loaded next time
				JRSaver.saveObject(jasperReport, ReportService.loadJasperFile(inputFileName));
			}
			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, params, dataSource);
			// return the PDF in bytes
			bytes = JasperExportManager.exportReportToPdf(jasperPrint);
		} catch (JRException | IOException e) {
			e.printStackTrace();
		}
		return bytes;

	}
}
