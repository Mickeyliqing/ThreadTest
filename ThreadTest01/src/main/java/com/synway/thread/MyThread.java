package com.synway.thread;

import org.junit.Test;

public class MyThread extends Thread {

	private int count = 5;

	public MyThread(String name) {
		super();
		this.setName(name);
	}
	
	@Override
	public void run() {
		super.run();
		while(count > 0) {
			count--;
			System.out.println(MyThread.currentThread().getName()+"计算,count="+count);
		}
	}
	
	@Test
	public void MyTest01() {
		MyThread a = new MyThread("A");
		MyThread b = new MyThread("B");
		MyThread c = new MyThread("C");
		a.start();
		b.start();
		c.start();
	}


	/*@Test
	public void MyTest02() {
		MyThread myThread = new MyThread(null);
		Thread a = new Thread(myThread, "A");
		Thread b = new Thread(myThread, "B");
		Thread c = new Thread(myThread, "C");
		a.start();
		b.start();
		c.start();
	}*/
	
	/*@Test
	public void MyTest03() {
		MyThread myThread = new MyThread(null);
		myThread.start();
		try {
			myThread.sleep(2000);
			myThread.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("Error");
		}
		
	}*/
}
