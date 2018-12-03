package com.synway.thread.string;

public class StringA implements Runnable {

	private boolean b = true;
	
	
	public void setB(boolean b) {
		this.b = b;
	}
	public void printStringA() {
		try {
			while(b == true) {
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void run() {
		printStringA();
	}

}
