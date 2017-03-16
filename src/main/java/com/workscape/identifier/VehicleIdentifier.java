package com.workscape.identifier;

import com.workscape.model.Vehicle;
import com.workscape.model.Vehicles;
import com.workscape.model.Wheels;

public class VehicleIdentifier {

	public void populateVehiclesIdentity(Vehicles inputVehicles, Vehicles vehiclesMasterData) {
		inputVehicles.getVehicles().forEach(inputVehicle -> {
			compareVehiclesAndPopulateIdentity(inputVehicle, vehiclesMasterData);
		});
	}
	
	private void compareVehiclesAndPopulateIdentity(Vehicle vehicle, Vehicles vehiclesMasterData) {
		vehiclesMasterData.getVehicles().forEach(masterVehicle->{
			if(masterVehicle.getFrame().equals(vehicle.getFrame())&&
					wheelCheck(masterVehicle.getWheels(), vehicle.getWheels()) &&
					masterVehicle.getPowertrain().equals(vehicle.getPowertrain())){
				vehicle.setVehicleType(masterVehicle.getVehicleType());
			}
			
		});
	}
	
	private boolean wheelCheck(Wheels masterVehicleWheels, Wheels inputVehicleWheels) {
		return (inputVehicleWheels.getWheels()==null && masterVehicleWheels.getWheels()==null)||
				(!(inputVehicleWheels.getWheels()==null && masterVehicleWheels.getWheels()!=null)&&
						!(inputVehicleWheels.getWheels()!=null && masterVehicleWheels.getWheels()==null)&&
				masterVehicleWheels.getWheels().size()==inputVehicleWheels.getWheels().size() && masterVehicleWheels.getWheels().containsAll(inputVehicleWheels.getWheels()));
	}
	
}
