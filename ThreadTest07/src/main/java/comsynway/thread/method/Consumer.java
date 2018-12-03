package comsynway.thread.method;

import comsynway.thread.entity.Value;

public class Consumer {

	private String lock;

	public Consumer(String lock) {
		super();
		this.lock = lock;
	}
	public void getValue() {
		try {
			synchronized (lock) {
				if(Value.value.equals("")){
					lock.wait();
				}
				String value = Thread.currentThread().getName();
				System.out.println("get的值是=" + value);
				Value.value = "";
				lock.notify();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
