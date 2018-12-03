package com.synway.thread.string;

import com.synway.thread.string.StringC.stringc;

public class StringCAndDTest {

	public static void main(String[] args) {
		final stringc name = new stringc();
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				name.method01();
				
			}
		},"A");
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				name.method02();
				
			}
		},"B");
		thread.start();
		thread2.start();
	}
}
