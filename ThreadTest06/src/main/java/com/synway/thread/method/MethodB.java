package com.synway.thread.method;

public class MethodB {

	public void waitTest(Object lock) {
		try {
			synchronized (lock) {
				System.out.println(Thread.currentThread().getName() + " wait()方法开始！");
				lock.wait();
				//Thread.sleep(2000);
				System.out.println(Thread.currentThread().getName() + " wait()方法结束！");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void notifyTest(Object lock) {
		try {
			synchronized (lock) {
				System.out.println(Thread.currentThread().getName() + " notify()方法开始！");
				lock.notify();
				Thread.sleep(2000);
				System.out.println(Thread.currentThread().getName() + " notify()方法结束！");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
