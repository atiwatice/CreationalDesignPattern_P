package com.abstractfactory.test;

public class DellLaptop implements LaptopFactory {
	private int storageSize;

	public DellLaptop(int storageSize) {
		this.storageSize = storageSize;
	}

	@Override
	public Processor createProcessor() {
		return new AppleProcessor();
	}

	@Override
	public Storage createStorage() {
		return new AppleStorage(storageSize);
	}
}
