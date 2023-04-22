public class Consumer extends Thread {
	
	Company c;
	
	public Consumer(Company c) {
		this.c = c;
	}
	
	public void run() {
		
		while(true) {
			try {
				this.c.consumer_item();
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
