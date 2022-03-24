package com.prototpye.test;

public class TestPrototype {
	public static void main(String[] args) {
		try {
		
			AccessControl userAccessControl = AccessControlProvider.getAccessControlObject("USER");
			User user = new User("User A","READ",userAccessControl);
			System.out.println("--------------");
			System.out.println(user);
			
			userAccessControl = AccessControlProvider.getAccessControlObject("USER");
			user = new User("User B","READ_WRITE",userAccessControl);
			System.out.println("--------------");
			System.out.println(user);
			
			userAccessControl = AccessControlProvider.getAccessControlObject("MANAGER");
			user = new User("User_MANAGER","READ_WRITE_REPORT",userAccessControl);
			System.out.println("--------------");
			System.out.println(user);
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}
}
