package Day4;

public class CheckingAccount extends Account {

	long overdraftAmount=0;
	public CheckingAccount(String holderName,long overdraftAmount) {
		
		super(holderName);
		this.overdraftAmount=overdraftAmount;
		
	}

	@Override
	boolean deposit(long amount) {
		
		this.transaction("Checking Deposit", amount);
		return true;
	}

	@Override
	boolean withdraw(long amount) {
		
		if(amount<=(this.getBalance()+overdraftAmount))
				{
			this.transaction("Checking Withdrawal", -amount);
			return true;
				}
		else
		return false;
	}

}
