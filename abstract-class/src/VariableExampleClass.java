
public class VariableExampleClass {
	 
	private final int field; // blank final variable
	public static final int JAVA_CONSTANT = 10;

	
	public VariableExampleClass() {
		field = 100;
	}
	
	public void changeValues(final int param) {
//		param = 1;
		final int localVar;
		localVar = 42;
//		localVar = 43;
	}
}
