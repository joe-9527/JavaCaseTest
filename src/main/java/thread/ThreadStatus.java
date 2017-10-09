package thread;

public class ThreadStatus {
	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			public void run() {
				System.out.println("thread start");
				
			}
		});
		
		thread.getState();
	}
}
