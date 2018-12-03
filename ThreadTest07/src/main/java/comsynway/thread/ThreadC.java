package comsynway.thread;

import comsynway.thread.entity.Tools;

public class ThreadC extends Thread {

	@SuppressWarnings("unchecked")
	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				Tools.local.set("ThreadC" + (i));
				System.out.println("ThreadC_Value = " + Tools.local.get());
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
