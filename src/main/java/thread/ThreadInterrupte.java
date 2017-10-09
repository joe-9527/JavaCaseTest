package thread;

public class ThreadInterrupte {
	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(new Runnable() {
			
			public void run() {
				int i = 0;
				while(true) {
					if(Thread.currentThread().isInterrupted()) {
						break;
					}
					System.out.println(i++);
				}
			}
		});
		thread.start();
		
		Thread.sleep(1000);
		/**
		 * 调用此方法只是会将线程的中断状态位置为true
		 * 而不会中断线程的执行
		 * 如果需要中断线程的执行，需要自己在run方法里进行监控
		 */
		thread.interrupt();
	}
}
