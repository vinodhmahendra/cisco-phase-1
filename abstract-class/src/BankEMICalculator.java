
public class BankEMICalculator {

	private String customerName;
	private String accountNo;
	private double loanAmount;
	private double monthlyPayment;

	public class EMICalculatorHelper{
		int loanTerm =60;
		double interestRate = 0.9;
		double interestpermonth = interestRate/loanTerm;
		
		protected double calcMonthyPayment (double loanAmount) {
			return 0.0;
			}
	}

}