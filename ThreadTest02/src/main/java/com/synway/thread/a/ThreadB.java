package com.synway.thread.a;

public class ThreadB extends Thread{

	private int count = 5;

	public ThreadB(String name) {
		super();
		this.setName(name);
	}
	
	public ThreadB() {
		super();
	}

	@Override
	public void run() {
		super.run();
		while(count > 0) {
			count--;
			System.out.println(ThreadB.currentThread().getName()+"计算,count="+count);
		}
	}
	
	public static void main(String[] args) {
		ThreadB a = new ThreadB("A");
		ThreadB b = new ThreadB("B");
		ThreadB c = new ThreadB("C");
		a.start();
		b.start();
		c.start();
	}
}
