package com.synway.thread.a;


public class ThreadC extends Thread {

	private int count = 5;

	@Override
	synchronized public void run() {
		super.run();
		
			count--;
			System.out.println(ThreadC.currentThread().getName()+"计算,count="+count);
		
		
	}
	
	public static void main(String[] args) {
		ThreadC ThreadC = new ThreadC();
		Thread a = new Thread(ThreadC, "A");
		Thread b = new Thread(ThreadC, "B");
		Thread c = new Thread(ThreadC, "C");
		a.start();
		b.start();
		c.start();
	}
}
