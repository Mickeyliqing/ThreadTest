package comsynway.thread.test;

import comsynway.thread.ThreadA;
import comsynway.thread.ThreadB;
import comsynway.thread.ThreadC;
import comsynway.thread.ThreadD;
import comsynway.thread.entity.Tools;
import comsynway.thread.method.Consumer;
import comsynway.thread.method.Producer;

public class ThreadTest01 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		/*String lock = new String("");
		Producer producer = new Producer(lock);
		Consumer consumer = new Consumer(lock);
		
		ThreadA a = new ThreadA(producer);
		a.setName("A");
		ThreadB b = new ThreadB(consumer);
		b.setName("B");
		
		a.start();
		b.start();*/
		
		try {
			ThreadC c = new ThreadC();
			ThreadD d = new ThreadD();
			
			c.start();
			d.start();
			
			for (int i = 0; i < 10; i++) {
				Tools.local.set("Main" + i);
				System.out.println("Main_Value = " + Tools.local.get());
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
