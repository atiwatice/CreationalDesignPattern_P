package com.abstractfactory.test;

public class DellStorage implements Storage {
	private int storageSize;

	public DellStorage(int storageSize) {
		super();
		this.storageSize = storageSize;
		System.out.println(storageSize + " GB HDD is used with dell");
	}

	@Override
	public void getType() {
		System.out.println("HDD");

	}

	@Override
	public String toString() {
		return storageSize+" GB Hard disk";
	}
}
