package Day4;

public abstract class Account {
	
	private long balance;
	private String holderName;
	
	public Account(String holderName)
	{
		this.holderName=holderName;
	}
	
	public final void transaction(String message, long amount)
	{
		System.out.println("Name of Holder : "+holderName);
		System.out.println("Message : "+message);
		System.out.println("Amount :"+amount);
		balance+=amount;
	}
	
	public long getBalance()
	{
		return this.balance;
	}
	
	abstract boolean deposit(long amount);
	
	abstract boolean withdraw(long amount);

}
