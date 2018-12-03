package com.synway.thread.method;

public class MethodA {

	private String lock = "123";
	public void methodtest() {
		try {
			synchronized (lock) {
				System.out.println(Thread.currentThread().getName() + "begin");
				lock = "456";
				Thread.sleep(2000);
				System.out.println(Thread.currentThread().getName() + "end");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
