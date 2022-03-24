package com.abstractfactory.test;

public class AppleStorage implements Storage {

	private int storageSize;

	public AppleStorage(int storageSize) {
		super();
		this.storageSize = storageSize;
		System.out.println(storageSize + " GB SSD is used with apple");
	}

	@Override
	public void getType() {
		System.out.println("SSD");

	}

	@Override
	public String toString() {
		return storageSize+" GB Solid state divice (SSD)";
	}

}
