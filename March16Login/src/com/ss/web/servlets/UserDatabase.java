package com.ss.web.servlets;

import java.util.HashMap;

public class UserDatabase {

	private static HashMap<String, String> loginInfo = new HashMap<String, String>();

	public static HashMap<String, String> getLoginInfo() {
		return loginInfo;
	}

}
