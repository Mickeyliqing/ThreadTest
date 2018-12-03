package comsynway.thread.method;

import comsynway.thread.entity.Value;

public class Producer {

	private String lock;

	public Producer(String lock) {
		super();
		this.lock = lock;
	}
	public void setValue() {
		try {
			synchronized (lock) {
				if(!Value.value.equals("")){
					lock.wait();
				}
				String value = Thread.currentThread().getName();
				System.out.println("set的值是=" + value);
				Value.value = value;
				lock.notify();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
