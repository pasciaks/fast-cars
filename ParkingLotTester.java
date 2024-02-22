package com.skilldistillery.encapsulation.labs;

public class ParkingLotTester {

	public static void main(String[] args) {

		// create new ParkingLotTester instance

		ParkingLotTester parkingLotTester = new ParkingLotTester();

		parkingLotTester.run();

	}

	public void run() {

		ParkingLot parkingLot = new ParkingLot();

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

		getAndShowCars(parkingLot); // show 4 initial cars

		parkingLot.removeCar(car2); // should be found + removed
		parkingLot.removeCar(car5); // will not be found and not removed

		getAndShowCars(parkingLot); // now down to 3 cars

		parkingLot.addCar(car5); // now add car5

		getAndShowCars(parkingLot); // back up to 4 cars
	}

	public void getAndShowCars(ParkingLot parkingLot) {

		Car[] gottenCars = parkingLot.getCars();
		System.out.println("Cars:" + gottenCars.length);
		for (Car car : gottenCars) {
			car.displayCar();
		}

	}

}
