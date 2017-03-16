package com.workscape.builder;

import java.util.List;

import com.workscape.model.Wheel;
import com.workscape.model.Wheels;

public class WheelsBuilder {
	
	private List<Wheel> wheelList;
	
	public WheelsBuilder withVehicle(List<Wheel> wheelList){
		this.wheelList = wheelList;
		return this;
	}
	
	public Wheels build(){
		Wheels wheels = new Wheels();
		wheels.setWheels(wheelList);
		return wheels;
	}

}
