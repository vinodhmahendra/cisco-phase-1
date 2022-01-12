import java.util.Date;

// Class names should be nouns in mixed case, "upper camel case"
public class CreditCard {
	
	public final int VISA = 5001;
	// names : short - meaningful
	public String accountName;
	public String cardNumber;
	public Date expDate;
	
	//one-character variable -- avoided
	String n;
	
	public double getCharges() {
			
		return 0.0;
	}
	
	// methods  -- > verbs in mixed case ---- "lower camel case"
	public void disputeCharge(String chargeId, float amount) {
		
	}

}
