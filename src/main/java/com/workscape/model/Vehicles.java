package com.workscape.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="vehicles")
@XmlAccessorType(XmlAccessType.FIELD) 
public class Vehicles {

	@XmlElement(name="vehicle")
	private List<Vehicle> vehicles;

	public List<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

	@Override
	public String toString() {
		return "Vehicles [vehicles=" + vehicles + "]";
	}

	
//	public Vehicle[] getVehicles() {
//		return vehicles;
//	}
//
//	public void setVehicles(Vehicle[] vehicles) {
//		this.vehicles = vehicles;
//	}

}
