package encapsulation;

public class Employee {
	//step-1 : one way to hide implementation details is to declare all of the fields private
	private int empId;
	private String name;
	private String ssn;
	private double salary;
	
	//step3
	public Employee(int empId,String name,String ssn,double salary) {
		this.empId = empId;
		this.name = name;
		this.ssn = ssn;
		this.salary = salary;
	}
	
	//step-2
	public void changeName(String newName) {
		if (newName != null) {
			this.name = newName;
		}
	}
	
	public void raiseSalary(double increase) {
		this.salary += increase;
	}
	
	public String toString() {
		return "Employee ID: "+ empId +
				"\n" +
				"Employee Name: " + name +
				"\n" +
				"Employee SSN: " + ssn +
				"\n" +
				"Employee Salary: " + salary;
	}
}
