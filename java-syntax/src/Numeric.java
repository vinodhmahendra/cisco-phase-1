
public class Numeric {

	public static void main(String[] args) {
		// Declaring a literal byte value
		byte b = 127;
		System.out.println("the value of b is " + b);

		if (b < Byte.MAX_VALUE) {
			b++;
		}
		System.out.println("the value of b is " + b);

		// Declaring a short
		short sh = Short.MAX_VALUE;
		System.out.println("the value of sh: " + sh);

		// System.out.println(Short.MIN_VALUE);

		// Declaring an int
		int i = Integer.MAX_VALUE;
		System.out.println("the value of i is  " + i);

		long l = Long.MAX_VALUE;
		System.out.println("the value of l is " + l);
		
		float f = Float.MAX_VALUE;
		System.out.println("the value of f is " + f);

		double d = Double.MAX_VALUE;
		System.out.println("the value of d is " + d);
	}

}
