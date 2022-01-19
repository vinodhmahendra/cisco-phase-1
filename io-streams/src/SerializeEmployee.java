import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeEmployee {
	
	public SerializeEmployee() {
		Employee e = new Employee(1, "vinodh", "vinodh.mahendra@simplearn.com", 10000.00);
		
		try {
			FileOutputStream f =  
					new FileOutputStream("employees.ser");
			ObjectOutputStream s =
					new ObjectOutputStream(f);
			
			s.writeObject(e);

			s.close();
		}catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new SerializeEmployee();
	}

}
