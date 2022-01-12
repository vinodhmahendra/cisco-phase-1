package clients;

import domain.Employee;
import domain.Manager;

public class Program {

	public static void main(String[] args) {
		//Employee e = new Employee();
		Employee e = new Employee(1,"vinodh", "222-22-2222", 10000.00);
		
		e.changeName("vinodh kumar");
		e.raiseSalary(5000.00);

//		System.out.println(e.toString());
		
		// print or println invoke the toString method of object automatically
		
		System.out.println(e);
		
		
		Manager mgr = new Manager(2, "samarth", "123-11-3454", 20000.00, "Marketing");
		mgr.raiseSalary(20000);
		
		String dept = mgr.getDeptName();
		
		Integer.parseInt("4");
		
		
	
	}

}
