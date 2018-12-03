package com.synway.thread.test;

import com.synway.thread.string.StringA;

public class StringTest {

	public static void main(String[] args) {
		StringA a = new StringA();
		new Thread(a).start();
		System.out.println("停止方法" + Thread.currentThread().getName());
		a.setB(false);
	}
}
