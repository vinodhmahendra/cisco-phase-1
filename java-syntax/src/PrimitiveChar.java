
public class PrimitiveChar {

	public static void main(String[] args) {
		char c1 = '1';
		char c2 = '2';
		char c3 = '3';
		
		char dollar = '\u0024';
		System.out.print(dollar);
		System.out.print(c1);
		System.out.print(c2);
		System.out.println(c3);
		
		char a1 = 'a';
		char a2 ='b';
		char a3 = 'c';
		
		char a4 = Character.toUpperCase('d');
		
		//wrapper class Character
		System.out.print(Character.toUpperCase(a1));
		System.out.print(Character.toUpperCase(a2) +""+ a4);
		System.out.println(Character.toUpperCase(a3));
	}

}
