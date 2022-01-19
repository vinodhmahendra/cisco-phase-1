
public class InitializingArrays {

	public static void main(String[] args) {
//		String[] names;
//		names = new String[3];
//		names[0] = "Georgianna";
//		names[1] = "Jen";
//		names[2] = "Simon";
		
		
		String[] names = {
				"Georgianna","Jen","Simon"
		};
		
		
		Employee[] employees = {
				new Employee(1, "vinodh") , new Employee(2, "kumar")
		};
		
		for ( Employee e : employees) {
			System.out.println(e);
		}
	}

}
