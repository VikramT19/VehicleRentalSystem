// Imports

import java.util.Scanner;

// Main class

public class Main {
    public static void main(String[] args) {
        RentalSystem rentalSystem = new RentalSystem();
        Scanner scanner = new Scanner(System.in);
        
        // Creating cars for rental
        Car car1 = new Car("C001", "Toyota", "Supra", 2020, false, "Coupe");
        Car car2 = new Car("C002", "Acura", "NSX", 2021, false, "Sedan");
        Car car3 = new Car("C003", "Ford", "Mustang", 2019, false, "Sports Car");
        Car car4 = new Car("C004", "Toyota", "GR Corolla", 2022, false, "Hatchback");
        Car car5 = new Car("C005", "Tesla", "Model S", 2023, false, "Electric");

        // Creating motorcycles available for rent
        Motorcycle motorcycle1 = new Motorcycle("M001", "Harley-Davidson", "Sportster", 2022, false, 2);
        Motorcycle motorcycle2 = new Motorcycle("M002", "Ducati", "Monster", 2023, false, 2);
        Motorcycle motorcycle3 = new Motorcycle("M003", "Kawasaki", "Ninja", 2021, false, 2);
        Motorcycle motorcycle4 = new Motorcycle("M004", "BMW", "S1000RR", 2020, false, 2);
        Motorcycle motorcycle5 = new Motorcycle("M005", "Suzuki", "GSX-R750", 2019, false, 2);

        // Adding all cars to inventory for rental 
        rentalSystem.addToInventory(car1.getVehicleID(), car1);
        rentalSystem.addToInventory(car2.getVehicleID(), car2);
        rentalSystem.addToInventory(car3.getVehicleID(), car3);
        rentalSystem.addToInventory(car4.getVehicleID(), car4);
        rentalSystem.addToInventory(car5.getVehicleID(), car5);
    
        // Adding all motorcycles to inventory for rental
        rentalSystem.addToInventory(motorcycle1.getVehicleID(), motorcycle1);
        rentalSystem.addToInventory(motorcycle2.getVehicleID(), motorcycle2);
        rentalSystem.addToInventory(motorcycle3.getVehicleID(), motorcycle3);
        rentalSystem.addToInventory(motorcycle4.getVehicleID(), motorcycle4);
        rentalSystem.addToInventory(motorcycle5.getVehicleID(), motorcycle5);

        // Menu for user to start rental (Option menu)
        System.out.println("Welcome to Vikram's premium rentals! Choose one of the following options to continue:");
        // Main menu
        while (true) {
            System.out.println("1. Rent a Vehicle"); // Option to rent vehicle
            System.out.println("2. Return a Vehicle"); // Option to return vehicle
            System.out.println("3. Show Available vehicles"); // Option to show all available vehicles
            System.out.println("4. Exit"); // Exit program
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt(); // Takes choice from user
            scanner.nextLine(); 

            // Options
            switch (choice) {
                case 1:
                    System.out.print("Enter vehicle ID to rent: ");
                    String rentVehicleID = scanner.nextLine();
                    rentalSystem.rentVehicle(rentVehicleID);
                    break;
                case 2:
                    System.out.print("Enter vehicle ID to return: ");
                    String returnVehicleID = scanner.nextLine();
                    rentalSystem.returnVehicle(returnVehicleID);
                    break;
                case 3:
                    System.out.println("Available Cars:");
                    rentalSystem.displayAvailableVehicles();
                    break;
                case 4:
                    System.out.println("Thank you for choosing Vikram's premium rentals! Hope to see you again! Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
