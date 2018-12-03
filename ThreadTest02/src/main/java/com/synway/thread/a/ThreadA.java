package com.synway.thread.a;

public class ThreadA implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("运行中------");
	}

	public static void main(String[] args) {
		Runnable runnable = new ThreadA();
		Thread thread = new Thread(runnable);
		thread.start();
		System.out.println("运行结束------");
	}
}
