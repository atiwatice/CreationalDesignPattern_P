package com.singleton.test;

public enum SingletonEnum {
	INSTANCE;

	public int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
