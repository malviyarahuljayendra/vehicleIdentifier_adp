package com.workscape.builder;

import java.util.List;

import com.workscape.model.Vehicle;
import com.workscape.model.Vehicles;
import com.workscape.model.Wheels;

public class VehiclesBuilder {
	
	private List<Vehicle> vehicleList;
	
	public VehiclesBuilder withVehicle(List<Vehicle> vehicleList){
		this.vehicleList = vehicleList;
		return this;
	}
	
	public Vehicles build(){
		Vehicles vehicles = new Vehicles();
		vehicles.setVehicles(vehicleList);
		return vehicles;
	}

}
