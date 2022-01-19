import domain.Consumer;
import domain.Producer;
import domain.Stack;

public class Program {
	
	public static void main(String[] args) {
		Stack stack =  new Stack();
		
		Producer p = new Producer(stack);
		Thread t1 = new Thread(p);
		t1.start();
		Consumer c =  new Consumer(stack);
		Thread t2 = new Thread(c);
		t2.start();
		

	}

}
