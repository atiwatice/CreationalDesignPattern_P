package com.builder.test;

public class CarDirector {
	private CarBuilder carBuilder;

	public CarDirector(CarBuilder carBuilder) {
		this.carBuilder = carBuilder;
	}

	public Car getCar() {
		return this.carBuilder.getCar();
	}

	public void makeCar() {
		this.carBuilder.buildBodyStyle();
		this.carBuilder.buildBreaks();
		this.carBuilder.buildEngine();
		this.carBuilder.buildFuelType();
		this.carBuilder.buildPower();
		this.carBuilder.buildSeats();
		this.carBuilder.buildWindows();
	}
}
