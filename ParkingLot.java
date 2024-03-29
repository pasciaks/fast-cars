package com.skilldistillery.encapsulation.labs;

public class ParkingLot {

	// These are called fields
	private Car[] cars;
	private int numberOfCars = 0;
	private static int MAX_CARS = 100;

	public ParkingLot() {
		cars = new Car[MAX_CARS];
	}

	public void removeCar(Car car) {
		boolean removed = false;
		for (int i = 0; i < cars.length; i++) {
			if (cars[i] != null) {
				if (cars[i].equals(car)) {
					cars[i] = null;
					numberOfCars--;
					removed = true;
				}
			}
		}
		if (!removed) {
			System.out.println("**Car not found");
			car.displayCar();
			System.out.println("**Car not found");

		} else {
			System.out.println("**Car removed");
			car.displayCar();
			System.out.println("**Car removed");
		}
	}

	// Improved addCar to use 'slot' basis instead of 'index' basis
	public void addCar(Car car) {
		if (numberOfCars >= MAX_CARS) {
			System.out.println("Parking lot is full");
			return;
		}
		for (int i = 0; i < cars.length; i++) {
			if (cars[i] == null) {
				cars[i] = car;
				numberOfCars++;
				return;
			}
		}
	}

	public void showCars(Car[] cars) {
		for (Car car : cars) {
			if (car == null) {
				// it's null
			} else {
				car.displayCar();
			}
		}
		System.out.println(cars.length);
	}

	public Car[] getCars() {
		// NOTE: the capacity might change or the indexing might be off
		Car[] storedCars = new Car[numberOfCars];
		int currentCarIndex = 0;
		for (int i = 0; i < cars.length; i++) {
			if (cars[i] != null) {
				// consider doing value by value copy instead of reference by reference
				storedCars[currentCarIndex++] = cars[i];
			}
		}
		return storedCars;
	}

}