package Day4;

public class MortgageAccount extends Account {

	long borrowedAmount=0;
	public MortgageAccount(String holderName, long borrowedAmount) {
		super(holderName);
		this.borrowedAmount=borrowedAmount;
		System.out.println("Initial Borrowed Amount : "+borrowedAmount);
	}

	@Override
	boolean deposit(long amount) {
		this.transaction("Mortgage Payment", -amount);
		return true;
	}

	@Override
	boolean withdraw(long amount) {
		
		return false;
	}

}