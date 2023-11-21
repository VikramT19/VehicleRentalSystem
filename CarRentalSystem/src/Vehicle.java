public class Vehicle {
	private String vehicleID; // ID of vehicle	
	private String make; // Make of vehicle
	private String model; //Model of vehicle
	private int year; // Year of vehicle
	private boolean isRented; // If it is rented or not

	// Constructor for Vehicle object
	public Vehicle(String vehicleID, String make, String model, int year, boolean isRented) {
		this.vehicleID = vehicleID;
		this.make = make;
		this.model = model;
		this.year = year;
		this.isRented = isRented;
	}

	// Getters and setters
	
	public String getVehicleID() {
		return vehicleID;
	}
	public void setVehicleID(String vehicleID) {
		this.vehicleID = vehicleID;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public boolean isRented() {
		return isRented;
	}
	public void setRented(boolean isRented) {
		this.isRented = isRented;
	}
}

// Subclass for a car

class Car extends Vehicle {
	private String type; // Type of car (Sedan, coupe, hatchback, etc.)

	// Constructor for a Car object 
	
	public Car(String vehicleID, String make, String model, int year, boolean isRented, String type) {
		super(vehicleID, make, model, year, isRented); 
		this.type = type;
	}
	// Getters and setters for subclass

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}	
}

// Subclass for a motorcycle

class Motorcycle extends Vehicle {
	private int numberOfwheels; // Number of wheels of motorcycle

	// Constructor for Motorcycle object
	public Motorcycle(String vehicleID, String make, String model, int year, boolean isRented, int numberOfwheels) {
		super(vehicleID, make, model, year, isRented);
		this.numberOfwheels = numberOfwheels;
		
	}

	// Getters and setters for subclass
	
	public int getNumberOfwheels() {
		return numberOfwheels;
	}

	public void setNumberOfwheels(int numberOfwheels) {
		this.numberOfwheels = numberOfwheels;
	}
}
