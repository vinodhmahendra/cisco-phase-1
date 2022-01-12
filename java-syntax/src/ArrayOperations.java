
public class ArrayOperations {

	public static void main(String[] args) {
		
		String[] names= new String[3];
		names[0] = "Blue Shirt";
		names[1] = "Red Shirt";
		names[2] = "Black Shirt";
		
		for(String name : names) {
			System.out.println("Name: " + name);
		}
		
		int[] numbers = {1,2,3,4,5};
		for(int number:numbers) {
			System.out.println("Number: "+number);
		}

	}

}
