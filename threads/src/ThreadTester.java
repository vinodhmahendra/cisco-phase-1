
public class ThreadTester {

	// parent thread
	public static void main(String[] args) {
		//step 3
		HelloRunner target  = new HelloRunner();
		
		//step 4
		Thread t1 = new Thread(target);
		
		
		Thread t2 = new Thread(target);
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		//step 5
		t1.start();
		System.out.println("is alive : " + t1.isAlive());
		System.out.println("T1 Priority : " + t1.getPriority());
//		t2.start();
	}

}
