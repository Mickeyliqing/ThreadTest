package com.synway.thread.Servlet;

public class ThreadTest {

	public static void main(String[] args) {
		ThreadA a = new ThreadA();
		a.start();
		
		ThreadB b = new ThreadB();
		b.start();
	}
}
