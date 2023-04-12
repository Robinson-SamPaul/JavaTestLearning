package simple;

public class AbzRaceCondition {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Counter c = new Counter();
		
		Runnable obj1 = () -> {
			for(int i=0; i<30; i++) {
				c.increment();
			}
		};
		Runnable obj2 = () -> {
			for(int i=0; i<30; i++) {
				c.increment();
			}
		};

		new Thread(obj1).join(); // it needs to handle exception
		new Thread(obj2).join();

		new Thread(obj1).start();
		new Thread(obj2).start();
		
		System.out.println(c.count);
	}

}

class Counter {
	
	long count;
	
	public synchronized void increment() {
		count++;
	}
}