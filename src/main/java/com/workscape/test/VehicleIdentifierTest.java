package com.workscape.test;

import com.workscape.identifier.VehicleIdentifier;
import com.workscape.model.Vehicles;
import com.workscape.report.generator.ReportGenerator;
import com.workscape.validator.Validator;
import com.workscape.xml.parser.XmlParser;

/**
 * Author-Rahul Malviya
 * 
 */
public class VehicleIdentifierTest {

	public static void main(String[] args) {
		
		XmlParser xmlParser = new XmlParser();

		// [1] Load input data
		Vehicles inputVehicles = xmlParser.parseXml(//File path
				"vehicles.xml");
		
		// [2] Validate input data
		new Validator().validateInputVehicles(inputVehicles);

		// [3] Load master data
		Vehicles vehiclesMasterData = xmlParser.parseXml(//File path
				"masterData.xml");

		// [4] Call VehicleIdetifier to get the identity of vehicles
		new VehicleIdentifier().populateVehiclesIdentity(inputVehicles, vehiclesMasterData);

		new ReportGenerator().generateReport(inputVehicles);
	}

}
