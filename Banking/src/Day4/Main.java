package Day4;

public class Main {

	public static void main(String[] args) {

		Account[] holders= new Account[3];
		holders[0]= new MortgageAccount("Sandeep", 100000);
		holders[1]= new CheckingAccount("Sandy",200);
		holders[2]= new CheckingAccount("Sunny",1000);
		
		for(int i=0;i<holders.length;i++)
		{
			System.out.println("Deposit Transaction 1000 :"+holders[i].deposit(1000));
			System.out.println("Withdraw Transaction 500:"+holders[i].withdraw(500));
			System.out.println("Withdraw Transaction 1000:"+holders[i].withdraw(1000));
			System.out.println("Withdraw Transaction 2000:"+holders[i].withdraw(2000));
			
		}
		
	}

}
