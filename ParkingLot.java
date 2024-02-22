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

	public void addCar(Car car) {
		this.cars[numberOfCars] = car;
		numberOfCars++;
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
				storedCars[currentCarIndex++] = cars[i];
			}
		}
		return storedCars;
	}

}