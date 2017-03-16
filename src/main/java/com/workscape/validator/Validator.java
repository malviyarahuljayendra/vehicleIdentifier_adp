package com.workscape.validator;

import com.workscape.model.Vehicles;

public class Validator {
	
	public void validateInputVehicles(Vehicles vehicles) {
		if(vehicles==null)
			throw new RuntimeException("Vehicles are null");
		vehicles.getVehicles().forEach(vehicle->{
			//Validate frame
			if(vehicle.getFrame()==null||isNullOrEmpty(vehicle.getFrame().getMaterial()))
				throw new RuntimeException("Invalid Frame value provided in the input");
			//Validate wheels
			if(vehicle.getWheels()==null)
				throw new RuntimeException("Invalid Wheels value provided in the input");
			//Validate powertrain
			if(vehicle.getPowertrain()==null||
					(vehicle.getPowertrain().getBernoulli()==null&&vehicle.getPowertrain().getHuman()==null&&vehicle.getPowertrain().getInternalCombustion()==null))
					throw new RuntimeException("Invalid Powertrain value provided in the input");
		});
	}
	
	private boolean isNullOrEmpty(String inputString) {
		return inputString==null||inputString.isEmpty()?true:false;
	}

}
