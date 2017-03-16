package com.workscape.builder;

import com.workscape.model.Frame;
import com.workscape.model.Powertrain;
import com.workscape.model.Vehicle;
import com.workscape.model.Wheels;

public class VehicleBuilder {
	
	private Frame frame;
	
	private Wheels wheels;
	
	private Powertrain powertrain;
	
	public VehicleBuilder withPowertrain(Powertrain powertrain){
		this.powertrain = powertrain;
		return this;
	}
	
	public VehicleBuilder withFrame(Frame frame){
		this.frame = frame;
		return this;
	}
	
	public VehicleBuilder withWheels(Wheels wheels){
		this.wheels = wheels;
		return this;
	}
	
	public Vehicle build(){
		Vehicle vehicle = new Vehicle();
		vehicle.setFrame(frame);
		vehicle.setWheels(wheels);
		return vehicle;
	}

}
