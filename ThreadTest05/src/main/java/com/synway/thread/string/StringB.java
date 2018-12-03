package com.synway.thread.string;

public class StringB extends Thread {

	//volatile private boolean isRun = true;
	private boolean isRun = true;
	public boolean isRun() {
		return isRun;
	}
	public void setRun(boolean isRun) {
		this.isRun = isRun;
	}
	
	/*@Override
	public void run() {
		System.out.println("进入Run()方法！");
		while(isRun == true) {
			//System.out.println("True");
		}
		System.out.println("线程结束!");
	}*/
	
	@Override
	public void run() {
		System.out.println("进入Run()方法！");
		String string = new String();
		while(isRun == true) {
			synchronized (string) {
				
			}
		}
		System.out.println("线程结束!");
	}
}
