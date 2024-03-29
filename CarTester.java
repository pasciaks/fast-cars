package com.skilldistillery.encapsulation.labs;

public class CarTester {

	public static void main(String[] args) {
		// Create two Cars and assign fields
		Car car1 = new Car();
		car1.setColor("Black");
		car1.setMake("Black");
		car1.setModel("Stratus");
		car1.setNumberOfWheels(4);
		car1.setPurchasePrice(15412.0);

		Car car2 = new Car();
		car2.setColor("Neon");
		car2.setMake("Ford");
		car2.setModel("F950");
		car2.setNumberOfWheels(4);
		car2.setPurchasePrice(74999.0);

		// Have the cars display themselves
		car1.displayCar();
		car2.displayCar();

		String car1Data = car1.toString();
		String car2Data = car2.toString();

		// Get the cars' data and display that
		System.out.println("Car 1 data: " + car1Data);
		System.out.println("Car 2 data: " + car2Data);
	}

}
