package com.abstractfactory.test;

public class AppleProcessor implements Processor {

	private Storage storage;

	public AppleProcessor() {
		System.out.println("Intell processor will be used for apple laptop");
	}

	@Override
	public void attachStorage(Storage storage) {
		this.storage = storage;
		System.out.println(storage + "is attched to the apple processor");
	}

	@Override
	public void printSpecs() {
		System.out.println(this.toString());

	}
	
}
