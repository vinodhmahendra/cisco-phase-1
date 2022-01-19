
public class RangeQuerys {

	public static void main(String[] args) {
		int l = 2, r = 5;
		System.out.println("sum of natural numbers L to R is: " + sumInRange(l,r));
	}

	private static int sumInRange(int l, int r) {
		
		return sumNatural(r)- sumNatural(l-1);
	}
	
	public static int sumNatural(int n) {
		int sum = (n* (n+1))/2;
		return sum;
	}

}
