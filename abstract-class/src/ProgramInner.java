
public class ProgramInner {
	public static void main(String[] args) {
		//create an instance of outer class
		BankEMICalculator emi = new BankEMICalculator();
		
		//create an instance of inner class
		BankEMICalculator.EMICalculatorHelper e  = emi.new EMICalculatorHelper();
	}

}
