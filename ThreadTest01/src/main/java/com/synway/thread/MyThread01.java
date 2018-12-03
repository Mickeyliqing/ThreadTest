package com.synway.thread;

import org.junit.Test;

public class MyThread01 extends Thread {

	@Override
	public void run() {
		super.run();
		for (int i = 0; i < 10; i++) {
			if(this.interrupted()){
				System.out.println("已经停止状态了！");
				break;
			}
			System.out.println("i="+i);
		}
		System.out.println("看到这句话说明线程并未终止------");
	}
	
	public static void main(String[] args) {
		try {
			MyThread01 thread01 = new MyThread01();
			thread01.start();
			thread01.sleep(2000);
			thread01.interrupt();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
