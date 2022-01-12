import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
//		char letter = 'a';
		char letter  = scanner.next().charAt(0);
		System.out.println(letter);
		//loop - 10
		//String string1 = new String("Hello");
		
		
//		String string1 = new String("Hello"); Bad Practice ( 2 objects)
//		String string1 = scanner.nextLine();
		//String class is immutable
		String string1 = "hello";
		String string2 = "World";
		String string3= "";
		
		String string4 = "hello";
		
		string3 = string1 + string2;
		
		System.out.println("Output : " + string3);

	}

}
