package com.abstractfactory.test;

public interface LaptopFactory {
	Processor createProcessor();
	Storage createStorage();
}
