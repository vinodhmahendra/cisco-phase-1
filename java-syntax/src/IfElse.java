import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		long a = 1;
		long b = 2;
		
		if ( a == b ) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		
		Scanner scanner = new Scanner(System.in);
		
//		scanner = sc.newscanner ;

		
		
//		int monthNumber  = 1;
		int monthNumber = scanner.nextInt();

		if ( monthNumber >= 1 && monthNumber <= 3 ) {
			System.out.println("You're in Quater 1");
		} else if ( monthNumber >= 4 && monthNumber <= 6 ){
			System.out.println("Youre  in Quater 2");
		}else {
			System.out.println("You're not in the first half of the year!");
		}
		
		
		
		/***
		 *  if ( condition ) 
		 *  	sysout/code 
		 *  
		 *  if ( condition ) {
		 *  	statements 
		 *  }
		 */

//		if (1) { // ERROR
//			
//		}
	}

}
