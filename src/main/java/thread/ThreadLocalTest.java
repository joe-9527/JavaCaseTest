package thread;


public class ThreadLocalTest {
	public static void main(String[] args) {
		TLTest target = new TLTest();
		for (int i = 0; i < 10 ; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			new Thread(target).start();;
		}
	}
	
}

class TLTest implements Runnable{
	private ThreadLocal<Long> tlDate = new ThreadLocal<Long>();
	private Long date = null;
	
	public void run() {
		date = System.currentTimeMillis();
		tlDate.set(System.currentTimeMillis());
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getId() + ",date:" + date + ", tlDate:" + tlDate.get());
	}
}

class T extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	}
}