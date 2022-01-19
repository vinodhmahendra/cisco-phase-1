

//step 1
public class HelloRunner implements Runnable{

	int  i ;
	//step 2
	@Override
	public void run() {
		i = 0 ;
		while ( true ) {
			System.out.println("Hello " + i++);
			if ( i == 10) {
				break;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
