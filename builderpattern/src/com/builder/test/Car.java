package com.builder.test;

public class Car {
	private String bodyStyle;
	private String power;
	private String Engine;
	private String breaks;
	private String seats;
	private String windows;
	private String fuelType;
	private String carType;

	public Car(String carType) {
		this.carType = carType;
	}
	
	public String getBodyStyle() {
		return bodyStyle;
	}

	public void setBodyStyle(String bodyStyle) {
		this.bodyStyle = bodyStyle;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public String getEngine() {
		return Engine;
	}

	public void setEngine(String engine) {
		Engine = engine;
	}

	public String getBreaks() {
		return breaks;
	}

	public void setBreaks(String breaks) {
		this.breaks = breaks;
	}

	public String getSeats() {
		return seats;
	}

	public void setSeats(String seats) {
		this.seats = seats;
	}

	public String getWindows() {
		return windows;
	}

	public void setWindows(String windows) {
		this.windows = windows;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	@Override
	public String toString() {
		return "Car [bodyStyle=" + bodyStyle + ", power=" + power + ", Engine=" + Engine + ", breaks=" + breaks
				+ ", seats=" + seats + ", windows=" + windows + ", fuelType=" + fuelType + ", carType=" + carType + "]";
	}
}
