package com.builder.test;

public class SedanCarBuilder implements CarBuilder {
	
	private final Car car = new Car("Sedan");
	
	@Override
	public void buildBodyStyle() {
		car.setBodyStyle(
				"Ecternal Dimantion-- overall length: 202," + " Over all width 76 inch, " + " front track 65 Inches");

	}

	@Override
	public void buildPower() {
		car.setPower("2280 hp 7000 rpm 4000@tarque");

	}

	@Override
	public void buildEngine() {
		car.setEngine("2.5 L drum based");

	}

	@Override
	public void buildBreaks() {
		car.setBreaks("4 wheel power brakes");

	}

	@Override
	public void buildSeats() {
		car.setSeats("5 seater with one baby seater");

	}

	@Override
	public void buildWindows() {
		car.setWindows("Laminatedfronglass and withdefoster rear glass");

	}

	@Override
	public void buildFuelType() {
		car.setFuelType("combustion injected fules");

	}

	@Override
	public Car getCar() {
		return car;
	}

}
