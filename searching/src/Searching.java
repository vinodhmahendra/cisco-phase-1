
public class Searching {
	public static int exponentialSearch(int[] arr,int value) {
		int length = arr.length-1;

		
		if  ( arr[0] == value) {
			return  0;
		}
		
		
		int  i = 1;
		while ( i < length && arr[i] <= value ) {
			i = i*2;
		}
		
		return binarSearch(arr, value);
	}
	
	
	public static int binarSearch(int[] arr , int value) {
		int start  = 0;
		int end = arr.length - 1;
		int middle = ( start + end )/ 2;
		
		while ( arr[middle] != value && start <= end) {
			if ( value < arr[middle]) {
				end = middle -1;
			}else {
				start = middle + 1;
			}
			middle = ( start + end) / 2;
		}
		if ( arr[middle] == value ) {
			System.out.println("The element is found at the index: "+middle);
			return middle;
		}else {
			System.out.println("The element " + value + " not found.");
			return -1;
		}
	}

	public static int linearSearch(int[] arr, int value) {
		for (int i = 0; i < arr.length; i++) {
			if ( arr[i] == value) {
				System.out.println("The element is found at the index: " + i);
				return i;
			}
		}
		System.out.println("The element " + value+ " not found");
		return -1;
	}
}
