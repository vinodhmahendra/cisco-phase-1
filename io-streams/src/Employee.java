import java.io.Serializable;

public class Employee implements Serializable{
	
	private Integer id;
	private String name;
	private transient String email;
	private double salary;
	
	
	public Employee(Integer id, String name, String email, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", salary=" + salary + "]";
	}
	

	

}
