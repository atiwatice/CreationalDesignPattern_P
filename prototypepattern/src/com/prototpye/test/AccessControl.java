package com.prototpye.test;

public class AccessControl implements Prototype {

	private final String controllevel;
	private final String access;

	public AccessControl(String controllevel, String access) {

		this.controllevel = controllevel;
		this.access = access;
	}

	@Override
	public AccessControl clone() throws CloneNotSupportedException {
		try {

			return (AccessControl)super.clone();
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}

	public String getControllevel() {
		return controllevel;
	}

	public String getAccess() {
		return access;
	}

}
