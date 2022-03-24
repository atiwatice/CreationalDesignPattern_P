package com.builder.test;

public class TestBuilderPattern {
	public static void main(String[] args) {
		CarBuilder carBuilder = new SedanCarBuilder();
		CarDirector carDirector = new CarDirector(carBuilder);
		carDirector.makeCar();
		System.out.println(carBuilder.getCar());

		carBuilder = new SportsCardBuilder();
		carDirector = new CarDirector(carBuilder);
		carDirector.makeCar();
		System.out.println(carBuilder.getCar());

	}
}
