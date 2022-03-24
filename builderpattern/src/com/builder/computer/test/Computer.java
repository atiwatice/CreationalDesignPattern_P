package com.builder.computer.test;

public class Computer {
	// required parameters
	private String HDD;
	private String RAM;

	// optional parameters
	private boolean isGraphicsCardEnabled;
	private boolean isBluetoothEnabled;
	private String comName;

	public String getHDD() {
		return HDD;
	}

	public String getRAM() {
		return RAM;
	}

	public boolean isGraphicsCardEnabled() {
		return isGraphicsCardEnabled;
	}

	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}
	
	public String comName() {
		return comName;
	}

	private Computer(ComputerBuilder builder) {
		this.HDD = builder.HDD;
		this.RAM = builder.RAM;
		this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
		this.isBluetoothEnabled = builder.isBluetoothEnabled;
		this.comName = builder.comName;
	}

	// Builder Class
	public static class ComputerBuilder {

		// required parameters
		private String HDD;
		private String RAM;

		// optional parameters
		private boolean isGraphicsCardEnabled;
		private boolean isBluetoothEnabled;
		private String comName;

		public ComputerBuilder(String hdd, String ram) {
			this.HDD = hdd;
			this.RAM = ram;
		}

		public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
			this.isGraphicsCardEnabled = isGraphicsCardEnabled;
			return this;
		}

		public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}
		
		public ComputerBuilder setComName(String comName) {
			this.comName = comName;
			return this;
		}

		public Computer build() {
			return new Computer(this);
		}

	}

	@Override
	public String toString() {
		return "Computer [HDD=" + HDD + ", RAM=" + RAM + ", isGraphicsCardEnabled=" + isGraphicsCardEnabled
				+ ", isBluetoothEnabled=" + isBluetoothEnabled + ", comName=" + comName + "]";
	}

}
