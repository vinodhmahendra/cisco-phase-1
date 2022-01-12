package clients;

public class Overloading {
	
	//Rules
	// argument lists must differ
	// Return types can be different
	public void print(int i ) {
		System.out.println(i);
	}
	
	public void print(String s) {
		System.out.println(s);
	}
	
	public void print(float f) {
		System.out.println(f);
	}
	
	public static void main(String[] args) {
		Overloading methods = new Overloading();
		methods.print("A");

	}

}
