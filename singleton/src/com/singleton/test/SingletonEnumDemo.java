package com.singleton.test;

public class SingletonEnumDemo {
	public static void main(String[] args) {

		SingletonEnum singletonEnum = SingletonEnum.INSTANCE;

		System.out.println(singletonEnum.getValue());
	}
}
