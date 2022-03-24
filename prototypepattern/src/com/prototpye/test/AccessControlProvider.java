package com.prototpye.test;

import java.util.HashMap;
import java.util.Map;

public class AccessControlProvider {
	private static Map<String, AccessControl> map = new HashMap<String, AccessControl>();

	static {
		System.out.println("Fetching the data from the mapp and creating the access control object");
		map.put("USER", new AccessControl("USER", "DO_WORK"));
		map.put("ADMIN", new AccessControl("ADMIN", "ADD_REMOVE_USERS"));
		map.put("MANAGER", new AccessControl("MANAGER", "READ_REPORT_GRNERATE"));
		map.put("VP", new AccessControl("VP", "MODIFY_REPORT"));

	}
	
	public static AccessControl getAccessControlObject(String controlLevel) throws CloneNotSupportedException {
		AccessControl ac = null;
		ac = map.get(controlLevel);
		if(ac!=null) {
			return ac.clone();
		}
		return null;
	}
}
