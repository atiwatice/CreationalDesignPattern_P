package com.singleton.test;

public class SingletonEager {
	private static SingletonEager sc = null;

	private SingletonEager() {
	}

//  Although this object is not use, it will create this in memory 
//	public static SingletonEager getInstance() {
//		return sc;
//	}

//	Multi trade running will cannot start	
//	public static synchronized SingletonEager getInstance() {
//		if (sc == null) {
//			sc = new SingletonEager();
//		}
//		return sc;
//	}

//	Not good for concurrence programming
//	public static synchronized SingletonEager getInstance() {
//		if (sc == null) {
//			sc = new SingletonEager();
//		}
//		return sc;
//	}

	public static SingletonEager getInstance() {
		if (sc == null) {
			synchronized (SingletonEager.class) {
				sc = new SingletonEager();
			}
		}
		return sc;
	}

}
