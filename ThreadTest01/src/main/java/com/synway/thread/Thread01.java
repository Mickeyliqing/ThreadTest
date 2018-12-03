package com.synway.thread;

public class Thread01 {

	private int num = 0;
	synchronized public void addI(String name) {
		try {
			if(name.equals("a")){
				num = 100;
				System.out.println("A set Over!");
				Thread.sleep(2000);
			}else {
				num = 200;
				System.out.println("B set Over!");
			}
			System.out.println(name + "num=" + num);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
