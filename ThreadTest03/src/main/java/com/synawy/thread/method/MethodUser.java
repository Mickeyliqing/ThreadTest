package com.synawy.thread.method;

public class MethodUser {

	@SuppressWarnings("unused")
	private String name;
	@SuppressWarnings("unused")
	private String pass;
	//同步代码块，则程序同步执行
	private String string = new String();
	/*public void setUser(String username,String password) {
		try {
			//异步执行
			//String string = new String();
			synchronized (string) {
				System.out.println(Thread.currentThread().getName() + "进入代码块");
				name = username;
				Thread.sleep(1000);
				pass = password;
				System.out.println(Thread.currentThread().getName() + " = username = " + username + ",password = "+ password);
				System.out.println(Thread.currentThread().getName() + "出去代码块");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/
	
	synchronized public void setUser(String username,String password) {
		try {
				System.out.println(Thread.currentThread().getName() + "进入代码块");
				name = username;
				Thread.sleep(1000);
				pass = password;
				System.out.println(Thread.currentThread().getName() + " = username = " + username + ",password = "+ password);
				System.out.println(Thread.currentThread().getName() + "出去代码块");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
