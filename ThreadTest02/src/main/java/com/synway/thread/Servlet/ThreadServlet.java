package com.synway.thread.Servlet;

public class ThreadServlet {

	private static String usernames;
	@SuppressWarnings("unused")
	private static String passwords;
	
	synchronized public static void doPost(String username,String password) {
		try {
			usernames = username;
			if(username.equals("a")){
				Thread.sleep(2000);
			}
			passwords = password;
			System.out.println("username = "+ usernames + ",passwords = "+ password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
