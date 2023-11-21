import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RentalSystem {
	private Map<String, Vehicle> vehicleInventory;
	private List <Vehicle> rentedVehicles;
	
	public RentalSystem() {
		this.vehicleInventory = new HashMap<>();
		this.rentedVehicles = new ArrayList<>();
		
	}
	
	public void addToInventory(String vehicleID, Vehicle vehicle) {
		vehicleInventory.put(vehicleID, vehicle);
	}
	
	public void rentVehicle(String vehicleID) {
		Vehicle vehicle = vehicleInventory.get(vehicleID);
		if (vehicle != null && !vehicle.isRented()) {
			vehicle.setRented(true);
			rentedVehicles.add(vehicle);
			System.out.println("Vehicle rented sucessfully: " + vehicleID);
		} else {
			System.out.println("Vehicle not available for rental: " + vehicleID);
		}
		
	}
	
	public void returnVehicle(String vehicleID) {
        Vehicle vehicle = vehicleInventory.get(vehicleID);
        if (vehicle != null && vehicle.isRented()) {
            vehicle.setRented(false);
            rentedVehicles.remove(vehicle);
            System.out.println("Vehicle returned successfully: " + vehicleID);
        } else {
            System.out.println("Invalid return operation for vehicle: " + vehicleID);
        }
    }

	public void displayAvailableVehicles() {
	    System.out.println("Available Vehicles:");
	    for (Vehicle vehicle : vehicleInventory.values()) {
	        if (!vehicle.isRented()) {
	            if (vehicle instanceof Car) {
	                Car car = (Car) vehicle;
	                System.out.println("Car ID: " + car.getVehicleID() +
	                        ", Make: " + car.getMake() +
	                        ", Model: " + car.getModel() +
	                        ", Type: " + car.getType());
	            } else if (vehicle instanceof Motorcycle) {
	                Motorcycle motorcycle = (Motorcycle) vehicle;
	                System.out.println("Motorcycle ID: " + motorcycle.getVehicleID() +
	                        ", Make: " + motorcycle.getMake() +
	                        ", Model: " + motorcycle.getModel() +
	                        ", Number of Wheels: " + motorcycle.getNumberOfwheels());
	            }
	        }
	    }
	}
	 
	public Map<String, Vehicle> getVehicleInventory() {
		return vehicleInventory;
	}

	public void setVehicleInventory(Map<String, Vehicle> vehicleInventory) {
		this.vehicleInventory = vehicleInventory;
	}

	public List<Vehicle> getRentedVehicles() {
		return rentedVehicles;
	}

	public void setRentedVehicles(List<Vehicle> rentedVehicles) {
		this.rentedVehicles = rentedVehicles;
	}

}
