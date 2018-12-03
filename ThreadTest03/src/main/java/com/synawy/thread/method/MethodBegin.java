package com.synawy.thread.method;

public class MethodBegin {

	private String string = new String();
	//这样写，无论getString()加不加synchronized程序都是异步执行
	public void SetString() {
		try {
			synchronized (string) {
				System.out.println("A begin");
				Thread.sleep(2000);
				System.out.println("A end");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/*synchronized public void SetString() {
		try {
				System.out.println("A begin");
				Thread.sleep(2000);
				System.out.println("A end");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/
	
	synchronized public void getString() {
		System.out.println("B begin");
		System.out.println("B end");
	}
}
