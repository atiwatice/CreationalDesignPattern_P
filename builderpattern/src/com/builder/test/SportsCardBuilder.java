package com.builder.test;

public class SportsCardBuilder implements CarBuilder {
	private final Car car = new Car("Sports");

	@Override
	public void buildBodyStyle() {
		car.setBodyStyle(
				"Ecternal Dimantion-- overall length: 102," + " Over all width 66 inch, " + " front track 55 Inches");

	}

	@Override
	public void buildPower() {
		car.setPower("4000 hp 7000 rpm 4000@tarque");

	}

	@Override
	public void buildEngine() {
		car.setEngine("3.5 L drum based");

	}

	@Override
	public void buildBreaks() {
		car.setBreaks("4 wheel drum brakes");

	}

	@Override
	public void buildSeats() {
		car.setSeats("5 seater with one baby seater");

	}

	@Override
	public void buildWindows() {
		car.setWindows("Laminated TFT fronglass and withdefoster rear glass");

	}

	@Override
	public void buildFuelType() {
		car.setFuelType("power fuel combustion injected fules");

	}

	@Override
	public Car getCar() {
		return car;
	}
}
