package com.workscape.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "vehicle")
@XmlAccessorType(XmlAccessType.FIELD) 
public class Vehicle {
	@XmlElement(name="id")
	private String id;
	
	@XmlElement(name="vehicleType")
	private String vehicleType;
	
	@XmlElement(name="frame") 
	private Frame frame;
	
	@XmlElement(name="wheels")
	private Wheels wheels;
	
	@XmlElement(name="powertrain")
	private Powertrain powertrain;
	 
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Frame getFrame() {
		return frame;
	}
	public void setFrame(Frame frame) {
		this.frame = frame;
	}
	
	public Wheels getWheels() {
		return wheels;
	}
	public void setWheels(Wheels wheels) {
		this.wheels = wheels;
	}
	public Powertrain getPowertrain() {
		return powertrain;
	}
	public void setPowertrain(Powertrain powertrain) {
		this.powertrain = powertrain;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", vehicleType=" + vehicleType + "]";
	}

}
