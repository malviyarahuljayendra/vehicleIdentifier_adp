package com.workscape.validator;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.workscape.builder.VehicleBuilder;
import com.workscape.builder.VehiclesBuilder;
import com.workscape.builder.WheelsBuilder;
import com.workscape.builder.FrameBuilder;
import com.workscape.builder.PowerTrainBuilder;
import com.workscape.model.Frame;
import com.workscape.model.Powertrain;
import com.workscape.model.Vehicle;
import com.workscape.model.Vehicles;
import com.workscape.model.Wheels;

public class ValidatorTest {
	
	private Validator validator;
	
	@Before
	public void initiallize() {
		validator = new Validator();
	}
	
	@Test
	public void nullVehiclesTest() {
		try {
			validator.validateInputVehicles(null);
		} catch (Exception e) {
			assertEquals("Vehicles are null", e.getMessage());
		}
	}
	
	@Test
	public void nullWheelsOfVehiclesTest() {
		try {
			Frame frame = new FrameBuilder().withMaterial("mockMaterial").build();
			Vehicle vehicle = new VehicleBuilder().withFrame(frame).build();
			Vehicles vehicles = new VehiclesBuilder().withVehicle(new ArrayList<Vehicle>(){{add(vehicle);}}).build();
			validator.validateInputVehicles(vehicles);
		} catch (Exception e) {
			assertEquals("Invalid Wheels value provided in the input", e.getMessage());
		}
	}
	
	@Test
	public void invalidFramesOfVehiclesTest() {
		try {
			Frame frame = new FrameBuilder().withMaterial("").build();
			Vehicle vehicle = new VehicleBuilder().withFrame(frame).build();
			Vehicles vehicles = new VehiclesBuilder().withVehicle(new ArrayList<Vehicle>(){{add(vehicle);}}).build();
			validator.validateInputVehicles(vehicles);
		} catch (Exception e) {
			assertEquals("Invalid Frame value provided in the input", e.getMessage());
		}
	}
	
	@Test
	public void invalidPowerTrainValueOfVehiclesTest() {
		try {
			Wheels wheels = new WheelsBuilder().build();
			Powertrain powertrain = new PowerTrainBuilder().build();
			Frame frame = new FrameBuilder().withMaterial("mockMaterial").build();
			Vehicle vehicle = new VehicleBuilder().withFrame(frame).withWheels(wheels).withPowertrain(powertrain).build();
			Vehicles vehicles = new VehiclesBuilder().withVehicle(new ArrayList<Vehicle>(){{add(vehicle);}}).build();
			validator.validateInputVehicles(vehicles);
		} catch (Exception e) {
			assertEquals("Invalid Powertrain value provided in the input", e.getMessage());
		}
	}

}
