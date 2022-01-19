import java.util.Arrays;

public class OrderStatistics {

	public static void main(String[] args) {
		int[] input = {12,3,5,7,19};
		
		int k = 2;
		
		System.out.println("K'th smallest element is: " + kthSmallest(input,k));

	}

	private static int kthSmallest(int[] input, int k) {
		System.out.println("Before: " + Arrays.toString(input));
		
		Arrays.sort(input);
		
		System.out.println("After: " + Arrays.toString(input));
		
		return  input[k];
	}

}
