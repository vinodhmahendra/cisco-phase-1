import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializeEmployee {
	
	public DeSerializeEmployee() {
		Employee e = null;
		
		try {
			FileInputStream f = 
					new FileInputStream("employees.ser");
			ObjectInputStream s =
					new ObjectInputStream(f);
			
			e = (Employee) s.readObject();
			s.close();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		System.out.println("Deserialized Employee object from employees.ser");
		System.out.println(e);
	}
	

	public static void main(String[] args) {
		new DeSerializeEmployee();
	}
}
