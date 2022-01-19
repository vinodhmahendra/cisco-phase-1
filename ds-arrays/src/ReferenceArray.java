
public class ReferenceArray {
	
	public static void main(String[] args) {
		ReferenceArray object = new ReferenceArray();
		Employee[] employees = object.createArray();
		
		object.printElements(employees);
	}
	
	public void printElements (Employee[] list) {
		for ( Employee e : list) {
			System.out.println(e);
		}
	}
	
	public Employee[] createArray() {
		//declare
		Employee[] employees;
		//creating
		employees = new Employee[3];
		
		//initializing 
		employees[0] = new Employee(1, "vinodh");
		employees[1] = new Employee(2, "kumar");
		employees[2] = new Employee(3, "mahendra");
		
		return employees;
	}

}
