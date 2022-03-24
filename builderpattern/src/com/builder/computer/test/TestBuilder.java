package com.builder.computer.test;

public class TestBuilder {
	public static void main(String[] args) {
		
		Computer comp = new Computer.ComputerBuilder("500 GB", "2 GB")
				.setBluetoothEnabled(true)
				.setGraphicsCardEnabled(true)
				.setComName("asd")
				.build();
		System.out.println(comp);
	}
}
