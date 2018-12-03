package com.synawy.thread.method;

public class Method {

	//不加锁就会变得线程不安全
	//加synchronized关键字，程序就会变得同步执行
	private int num = 0;
	synchronized public void add(String username) {
		try {
			//线程安全
			//int num = 0;
			if(username.equals("a")){
				num = 100;
				System.out.println("a Set Over!");
				Thread.sleep(2000);
			}else {
				num = 200;
				System.out.println("b Set Over!");
			}
			System.out.println(username + "= num = " + num);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
