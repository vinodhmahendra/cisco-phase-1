package clients;

import domain.Box;

public class TestBox {

	public static void main(String[] args) {
		Box b1 = new Box();
		System.out.println(b1.volume());
		
		Box b2 = new Box(2);
		System.out.println(b2.volume());
		
		Box b3 = new Box(2, 3, 7);
		System.out.println(b3.volume());

	}

}
