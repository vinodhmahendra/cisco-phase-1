
public class MergeSort {
	
	public static void mergeSort  (int[] array , int left , int right) {
		if ( right > left) {
			int m = ( left + right) / 2;
			mergeSort(array, left, m);
			mergeSort(array, m+1, right);
			merge(array,left,m,right);
		}
	}
	
	private static void merge(int[] array, int left, int middle, int right) {
		int[] leftTMpArray = new int[middle-left+2];
		int[] rightTmpArray = new int[right-middle+1];
		
		for (int i = 0 ; i <= middle-left;i++) {
			leftTMpArray[i] = array[left+i];
		}
		
		for (int i = 0 ; i < right - middle ; i++) {
			rightTmpArray[i] = array[middle+1+i];
		}
		
		leftTMpArray[middle-left+1] = Integer.MAX_VALUE;
		rightTmpArray[right-middle] = Integer.MAX_VALUE;
		
		int i = 0 , j = 0;
		for (int k = left ; k <= right ; k++) {
			if ( leftTMpArray[i] < rightTmpArray[j]) {
				array[k] = leftTMpArray[i];
				i++;
			}else {
				array[k] = rightTmpArray[j];
				j++;
			}
		}
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "  ");
		}
		System.out.println();
	}

}
