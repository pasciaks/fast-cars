package com.skilldistillery.encapsulation.labs;

public class ParkingLotTester {

	public static void main(String[] args) {

		ParkingLot parkingLot = new ParkingLot();

		Car[] gottenCars = parkingLot.getCars();
		System.out.println("Cars:" + gottenCars.length);

		// iterate through all gottenCars
		for (Car car : gottenCars) {
			System.out.println(car);
		}

		// create new car instance
		Car car1 = new Car("Ford", "Mustang", "Red", 4, 28000.00);
		Car car2 = new Car("Chevy", "Tahoe", "White", 4, 31000.00);
		Car car3 = new Car("Toyota", "Supra", "Blue", 4, 26000.00);
		Car car4 = new Car("Nissan", "Sentra", "Purple", 4, 18000.00);
		Car car5 = new Car("NotParker", "Tester", "Silver", 4, 12000.00);

		parkingLot.addCar(car1);
		parkingLot.addCar(car2);
		parkingLot.addCar(car3);
		parkingLot.addCar(car4);

		// NOTE: car5 isn't being added on purpose

		gottenCars = parkingLot.getCars();

		System.out.println("Cars:" + gottenCars.length);

		parkingLot.showCars(gottenCars);

		parkingLot.removeCar(car2); // should be removed

		parkingLot.removeCar(car5); // will not be found, not removed

		gottenCars = parkingLot.getCars();

		parkingLot.showCars(gottenCars);

		parkingLot.addCar(car5);
		gottenCars = parkingLot.getCars();
		parkingLot.showCars(gottenCars);
	}

}
