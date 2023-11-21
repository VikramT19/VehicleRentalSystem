public class Vehicle {
	private String vehicleID;
	private String make;
	private String model;
	private int year;
	private boolean isRented;
	
	public Vehicle(String vehicleID, String make, String model, int year, boolean isRented) {
		this.vehicleID = vehicleID;
		this.make = make;
		this.model = model;
		this.year = year;
		this.isRented = isRented;
	}
	
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

class Car extends Vehicle {
	private String type;
	
	public Car(String vehicleID, String make, String model, int year, boolean isRented, String type) {
		super(vehicleID, make, model, year, isRented); 
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}	
}

class Motorcycle extends Vehicle {
	private int numberOfwheels;
	
	public Motorcycle(String vehicleID, String make, String model, int year, boolean isRented, int numberOfwheels) {
		super(vehicleID, make, model, year, isRented);
		this.numberOfwheels = numberOfwheels;
		
	}

	public int getNumberOfwheels() {
		return numberOfwheels;
	}

	public void setNumberOfwheels(int numberOfwheels) {
		this.numberOfwheels = numberOfwheels;
	}
}
