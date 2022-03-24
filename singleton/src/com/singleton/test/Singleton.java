package com.singleton.test;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class Singleton implements Serializable {

//	 Block clone method
	private static final long serialVersionUID = 3384239826916245949L;

	private static Singleton sc = new Singleton();

	private Singleton() {
		if (sc != null) {
			throw new IllegalStateException("Object is already created.");

		}
	}

	private static Singleton getInstance() {
		return sc;
	}

	private Object writeResolve() throws ObjectStreamException {
		return sc;
	}

	private Object writeRepalce() throws ObjectStreamException {
		return sc;
	}

	public Object clone() throws CloneNotSupportedException {
		return new CloneNotSupportedException("Singleton cannot be cloned.");
	}
	
	
	private static Class getclass(String className) throws ClassNotFoundException{
		ClassLoader classLoader =Thread.currentThread().getContextClassLoader();
		if(classLoader==null) {
			classLoader = Singleton.class.getClassLoader();
			
		}
		return (classLoader.loadClass(className));
	}
	

}
