package thread;

public class DeamonThread extends Thread{
	public void run() {
		try {
			Thread.sleep(100);
			System.out.println(Thread.currentThread().getName() + " is running");
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			System.out.println("the thread is called");
		}
	}
	
	public static void main(String[] args) {
		/**
		 * 守护线程一般是做支持用的线程，例如gc的线程
		 * 非守护线程（用户线程）执行完毕时， 程序就退出了，因为这时候守护线程不需要起作用了
		 * 所以如下设置为true时，还来不及执行run方法，程序就已经退出了
		 */
		DeamonThread thread = new DeamonThread();
		thread.setDaemon(true);
		thread.start();
	}
	
}
