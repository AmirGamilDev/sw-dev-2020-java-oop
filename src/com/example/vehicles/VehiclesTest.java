package com.example.vehicles;

public class VehiclesTest {

	public static void main(String[] args) {
		Vehicle[] vehicles = new Vehicle[3];
		
		vehicles[0] = new Trike(3, "Red");
		vehicles[1] = new Car(4, "Blue");
		vehicles[2] = new Bicyle(2, "Brown");
		
		for(Vehicle vehicle : vehicles) {
			if(vehicle instanceof Car) {
				((Car) vehicle).startEngine();
				
				// same as this...
//				Car aCar = (Car) vehicle;
//				aCar.startEngine();
			}
			
			vehicle.move();
			vehicle.stop();
			
			System.out.println(vehicle.toString());
			System.out.println();
		}
	}
}
