package Day1;
import java.util.Scanner;

public class TempConvert {
	
	public static void main(String args[])
	{
		System.out.println("Enter the temperature in Farenheit");
		Scanner s= new Scanner(System.in);
		String temp= s.nextLine();
		double f= Double.valueOf(temp);	
		double c= 5*(f-32)/9;
		System.out.println("The temperature in Celcius is : "+ c);
	}

}
