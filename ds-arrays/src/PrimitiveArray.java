
public class PrimitiveArray {
	
	public static void main(String[] args) {
		PrimitiveArray object = new PrimitiveArray();
		char[] characters = object.createArray();
		object.printElements(characters);
	}
	
	
	public void printElements(char[] c) {
//		for (int i = 0; i < c.length; i++) {
//			System.out.println(c[i]);
//		}
		
		for (char ch : c) {
			System.out.println(ch);
		}
	}
	public char[] createArray() {
		//declare
		char[] s;
		//creating
		s = new char[26];
		//initializing
		for ( int i = 0 ; i < 26 ; i++) {
			s[i] = (char) ('A' +i);
		}
		
		return s;
	}

}
