
//step 1
public class MyThread extends Thread{

	int  i ;
	
	//step 2
	@Override
	public void run() {
		i = 0;
		while  ( true ) {
			System.out.println("Hello " + i++);
			if ( i == 15 ) {
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		Thread t = new MyThread();
		t.start();
	}
}
