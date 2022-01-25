public class Driver {

	public static void main(String[] args) {
		int[] unsortedArray = {5,7,4,3,8,6,1,9,2};
		
		QuickSort.printArray(unsortedArray);
		
		QuickSort.quickSort(unsortedArray, 0, unsortedArray.length-1);

		QuickSort.printArray(unsortedArray);
		
//		MergeSort.printArray(unsortedArray);
//		MergeSort.mergeSort(unsortedArray, 0, unsortedArray.length-1);
//		MergeSort.printArray(unsortedArray);
		
//		InsertionSort.printArray(unsortedArray);
//		InsertionSort.insertionSory(unsortedArray);
//		InsertionSort.printArray(unsortedArray);
//		
//		BubbleSort.printArray(unsortedArray);
//		
//		BubbleSort.bubbleSort(unsortedArray);
//		
//		BubbleSort.printArray(unsortedArray);

		//		SelectionSort.printArray(unsortedArray);
		
//		SelectionSort.selectionSort(unsortedArray);
//		System.out.println();
//		
//		SelectionSort.printArray(unsortedArray);
		
//		String[] s = { "B", "A","C"};
//		Arrays.sort(s);
//		System.out.println();
//		System.out.println(Arrays.toString(s));
		

	}

}
