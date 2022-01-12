package domain;

public class Manager extends Employee{
	
		private String deptName;
		
		//define a default constructor in parent class
		// define constructor in subclass
		public Manager(int empId,String name,String ssn,double salary, String deptName) {
			//invoke constructor in Employee class (super)
			super(empId,name,ssn,salary);//first statement of the constructor
			this.deptName = deptName;
		}
		
		public String getDeptName() {
			return deptName;
		}

}
