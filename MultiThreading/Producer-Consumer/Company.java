public class Company {
	
	int n;
	boolean f = false;
	
	synchronized public void producer_item(int n) throws Exception{
		if(f) {
			wait();
		}
		this.n = n;
		System.out.println("Produced : "+n);
		f = true;
		notify();
	}
	
	synchronized public int consumer_item() throws Exception {
		if(!f) {
			wait();
		}
		System.out.println("Consumed : "+this.n);
		f = false;
		notify();
		return this.n;
	}
	
}
