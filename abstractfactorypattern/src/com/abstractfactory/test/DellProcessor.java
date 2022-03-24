package com.abstractfactory.test;

public class DellProcessor implements Processor {
	private Storage storage;

	public DellProcessor(Storage storage) {
		this.storage = storage;
		System.out.println("AMD processor will be used for dell laptop");
	}

	@Override
	public void attachStorage(Storage storage) {
		this.storage = storage;
		System.out.println(storage + "is attched to the dell processor");
	}

	@Override
	public void printSpecs() {
		System.out.println(this.toString());

	}
}
