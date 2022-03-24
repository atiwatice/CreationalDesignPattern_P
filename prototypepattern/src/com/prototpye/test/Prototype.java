package com.prototpye.test;



public interface Prototype extends Cloneable {
	public AccessControl clone() throws CloneNotSupportedException;
}
