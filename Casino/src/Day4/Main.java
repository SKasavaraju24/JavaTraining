package Day4;

import java.util.concurrent.ThreadLocalRandom;;
public class Main {
	
	public enum MachineSpin { BAR , MEDAL, COIN, TRIPLE_BAR, CHERRY};
	
	public static void main(String args[])
	{
		int spins[]= new int[3];
		for(int i=0;i<3;i++)
		{
			spins[i]= ThreadLocalRandom.current().nextInt(5);
		}
		for(int i=0;i<spins.length;i++){
		System.out.print(MachineSpin.values()[spins[i]]);
		if(i!=(spins.length-1))
			System.out.print(":");
	}
	}
}