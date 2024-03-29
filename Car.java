package com.skilldistillery.encapsulation.labs;

public class Car {
	private String make;
	private String model;
	private String color;
	private int numberOfWheels;
	private double purchasePrice;

	// Add a no arguments constructor
	public Car() {
		this.make = "Unknown";
		this.model = "Unknown";
		this.color = "Unknown";
		this.numberOfWheels = 4;
		this.purchasePrice = Double.MAX_VALUE;
	}

	// Add Constructor for all 5 fields
	public Car(String make, String model, String color, int numberOfWheels, double purchasePrice) {
		this.make = make;
		this.model = model;
		this.color = color;
		this.numberOfWheels = numberOfWheels;
		this.purchasePrice = purchasePrice;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	public double getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public String toString() {
		String output = "make=" + make + ", model=" + model + ", color=" + color + ", numberOfWheels=" + numberOfWheels
				+ ", purchasePrice=" + purchasePrice;
		return output;
	}

	public void displayCar() {
		String carData = toString();
		System.out.println(carData);
	}
}
