package com.workscape.report.generator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.workscape.identifier.VehicleIdentifier;
import com.workscape.model.Vehicles;
import com.workscape.xml.parser.XmlParser;

public class ReportGeneratorTest {

	private VehicleIdentifier vehicleIdentifier;

	private XmlParser xmlParser;
	
	private ReportGenerator reportGenerator;

	@Before
	public void initiallize() {
		vehicleIdentifier = new VehicleIdentifier();
		xmlParser = new XmlParser();
		reportGenerator = new ReportGenerator();
	}
	
	@Test
	public void generateReportTest() {
		Vehicles inputVehicles = xmlParser.parseXml(// File path
				"vehicles_test.xml");

		Vehicles vehiclesMasterData = xmlParser.parseXml(// File path
				"masterData.xml");

		vehicleIdentifier.populateVehiclesIdentity(inputVehicles, vehiclesMasterData);
		
		reportGenerator.generateReport(inputVehicles);
		
		assertEquals(1, reportGenerator.getBigWheelCount()[0]);
		assertEquals(2, reportGenerator.getBicycleCount()[0]);
		assertEquals(0, reportGenerator.getCarCount()[0]);
		assertEquals(0, reportGenerator.getMotorCycleCount()[0]);
		assertEquals(0, reportGenerator.getHangGliderCount()[0]);
	}
	
}
