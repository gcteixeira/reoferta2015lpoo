package br.univel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class SimpleReportJdbc {

	private String arq = "C:\\Users\\fernandod\\JasperStudioWorkspace\\MyReports\\Blank_A4.jasper";

	public SimpleReportJdbc() {

		JasperPrint jasperPrint = null;
		try {
			jasperPrint = JasperFillManager.fillReport(arq, null,
					getConnection());
			JasperViewer jasperViewer = new JasperViewer(jasperPrint);
			jasperViewer.setVisible(true);
		} catch (JRException ex) {
			ex.printStackTrace();
		}
	}

	private Connection getConnection() {
		try {
			return DriverManager.getConnection(
					"jdbc:mysql://192.168.105.10:3306/classicmodels", "jasper",
					"jasper");
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	public static void main(String[] args) {
		new SimpleReportJdbc();
	}
}