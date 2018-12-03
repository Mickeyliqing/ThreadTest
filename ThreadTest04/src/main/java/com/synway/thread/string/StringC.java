package com.synway.thread.string;

public class StringC {

	public static class stringc {
		public void method01() {
			synchronized ("其他的索") {
				for (int i = 0; i < 10; i++) {
					System.out.println(Thread.currentThread().getName() + "i = " + i);
					try {
						Thread.sleep(2000);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
		public void method02() {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName() + "i = "+ i);
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
