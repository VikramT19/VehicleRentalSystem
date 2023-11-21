// Imports

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// RentalSystem class

public class RentalSystem {
	private Map<String, Vehicle> vehicleInventory; // Inventory of vehicles for rent
	private List <Vehicle> rentedVehicles; // List of vehicles that are rented

	// Constructor for RentalSystem object
	public RentalSystem() {
		this.vehicleInventory = new HashMap<>();
		this.rentedVehicles = new ArrayList<>();
		
	}
	
	// Method to add a vehicle to the inventory
	public void addToInventory(String vehicleID, Vehicle vehicle) {
		vehicleInventory.put(vehicleID, vehicle);
	}

	// Method to rent a vehicl;e
	public void rentVehicle(String vehicleID) {
		Vehicle vehicle = vehicleInventory.get(vehicleID); // Find the vehicle in the inventory with the ID
		if (vehicle != null && !vehicle.isRented()) { // Checking if the vehicle exists and isn't rented. If so, enter the if statement.
			vehicle.setRented(true); // Tag vehicle  as rented
			rentedVehicles.add(vehicle); // Add the vehicle to rentedVehicles list
			// Output message if rented or not
			System.out.println("Vehicle rented sucessfully: " + vehicleID);
		} else {
			System.out.println("Vehicle not available for rental: " + vehicleID);
		}
		
	}

	// Method to return vehicle after rental
	public void returnVehicle(String vehicleID) {
        	Vehicle vehicle = vehicleInventory.get(vehicleID); // Find vehicle with ID
        	if (vehicle != null && vehicle.isRented()) { // If vehicle exists and is rented, enter if statement
            		vehicle.setRented(false); // Set rental as available
            		rentedVehicles.remove(vehicle); // Remove the vehicle from the list
			// Output message if rental returned or not
           		 System.out.println("Vehicle returned successfully: " + vehicleID);
        	} else {
            		System.out.println("Invalid return operation for vehicle: " + vehicleID);
        	}
    	}

	// Method to print or show the available vehicles for rent
	
	public void displayAvailableVehicles() {
	    System.out.println("Available Vehicles:");
	    for (Vehicle vehicle : vehicleInventory.values()) { 
	        if (!vehicle.isRented()) { // Cars available for rent
	            if (vehicle instanceof Car) {
	                Car car = (Car) vehicle;
	                System.out.println("Car ID: " + car.getVehicleID() +
	                        ", Make: " + car.getMake() +
	                        ", Model: " + car.getModel() +
	                        ", Type: " + car.getType());
	            } else if (vehicle instanceof Motorcycle) { // Motorcycles available for rent
	                Motorcycle motorcycle = (Motorcycle) vehicle;
	                System.out.println("Motorcycle ID: " + motorcycle.getVehicleID() +
	                        ", Make: " + motorcycle.getMake() +
	                        ", Model: " + motorcycle.getModel() +
	                        ", Number of Wheels: " + motorcycle.getNumberOfwheels());
	            }
	        }
	    }
	}

	// Getters and setters for class
	 
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
