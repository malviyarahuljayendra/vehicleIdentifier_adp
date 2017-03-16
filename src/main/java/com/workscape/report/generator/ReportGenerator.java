package com.workscape.report.generator;

import com.workscape.model.Vehicles;

public class ReportGenerator {
	
	private int[] carCount = { 0 };
	private int[] bicycleCount = { 0 };
	private int[] motorCycleCount = { 0 };
	private int[] bigWheelCount = { 0 };
	private int[] hangGliderCount = { 0 };

	public void generateReport(Vehicles inputVehicles) {
		
		System.out.println("Vehicles' id and their corresponding types---------------------------->");
		inputVehicles.getVehicles().forEach(inputVehicle -> {
			System.out.println("id-->" + inputVehicle.getId() + "; and type-->" + inputVehicle.getVehicleType());
			switch (inputVehicle.getVehicleType()) {
			case "Big Wheel":
				bigWheelCount[0] += 1;
				break;
			case "Bicycle":
				bicycleCount[0] += 1;
				break;
			case "Motorcycle":
				motorCycleCount[0] += 1;
				break;
			case "Hang Glider":
				hangGliderCount[0] += 1;
				break;
			case "Car":
				carCount[0] += 1;
				break;
			default:
				break;
			}
		});
		System.out.println("Vehicles' types and their corresponding counts---------------------------->");
		System.out.println("Big Wheel Count-->" + bigWheelCount[0]);
		System.out.println("Bicycle Count-->" + bicycleCount[0]);
		System.out.println("Motorcycle Count-->" + motorCycleCount[0]);
		System.out.println("Hang Glider Count-->" + hangGliderCount[0]);
		System.out.println("Car Count-->" + carCount[0]);
	}

	public int[] getCarCount() {
		return carCount;
	}

	public int[] getBicycleCount() {
		return bicycleCount;
	}

	public int[] getMotorCycleCount() {
		return motorCycleCount;
	}

	public int[] getBigWheelCount() {
		return bigWheelCount;
	}

	public int[] getHangGliderCount() {
		return hangGliderCount;
	}
	
}
