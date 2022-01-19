
public class TestInvalidAgeException {

	
	static void validate ( int age ) throws InvalidAgeException{
		if ( age < 18 ) {
			// throw an object of user defined exception
			throw new InvalidAgeException("age is not valid to vote!");
		}else {
			System.out.println(" welcome to vote");
		}
	}
	
	public static void main(String[] args) {
		try {
			validate(13);
		}catch (InvalidAgeException e) {
			System.out.println("Error accured : " +e.getMessage());
		}
	}
}
