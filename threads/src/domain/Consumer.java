package domain;

public class Consumer implements Runnable{
	
	private Stack stack;
	
	public Consumer(Stack stack) {
		this.stack = stack;
	}
	
	@Override
	public void run() {
		char c;
		for ( int i = 0 ; i < 200 ; i++) {
			c = stack.pop();
			System.out.println("Consumer: " + c);
			
			try {
				Thread.sleep((int)Math.random()*300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
