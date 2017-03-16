package com.workscape.identifier;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.workscape.model.Vehicles;
import com.workscape.validator.Validator;
import com.workscape.xml.parser.XmlParser;

public class VehicleIdentifierTest {

	private VehicleIdentifier vehicleIdentifier;

	private XmlParser xmlParser;

	@Before
	public void initiallize() {
		vehicleIdentifier = new VehicleIdentifier();
		xmlParser = new XmlParser();
	}

	@Test
	public void vehicleIdentifierTest() {
		Vehicles inputVehicles = xmlParser.parseXml(// File path
				"vehicles_test.xml");

		Vehicles vehiclesMasterData = xmlParser.parseXml(// File path
				"masterData.xml");

		vehicleIdentifier.populateVehiclesIdentity(inputVehicles, vehiclesMasterData);

		inputVehicles.getVehicles().forEach(inputVehicle -> {
			switch (inputVehicle.getId()) {
			case "vehicle 1":
				assertEquals("Big Wheel", inputVehicle.getVehicleType());
				break;
			case "vehicle 2":
				assertEquals("Bicycle", inputVehicle.getVehicleType());
				break;
			case "vehicle 3":
				assertEquals("Bicycle", inputVehicle.getVehicleType());
				break;
			default:
				break;
			}
		});
	}

}
