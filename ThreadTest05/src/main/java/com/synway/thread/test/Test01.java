package com.synway.thread.test;

import com.synway.thread.string.StringB;

public class Test01 {

	public static void main(String[] args) {
		try {
			StringB b = new StringB();
			b.start();
			Thread.sleep(1000);
			b.setRun(false);
			System.out.println("硬件被赋值false!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
