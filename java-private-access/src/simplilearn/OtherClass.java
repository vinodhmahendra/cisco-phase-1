package simplilearn;

import cisco.Employee;

public class OtherClass {
	
	public void accessPrivateMember() {
		Employee e = new Employee();
//		e.name = "vinodh"; is not visible (error)
	}

}
