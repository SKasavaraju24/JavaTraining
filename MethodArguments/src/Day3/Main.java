package Day3;

public class Main {

	static String arr[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
	public static void main(String[] args) {
	
		//Following call will use the method having both double arguments
		System.out.println(addUp(3.2,2.2));
	   
		//Following call will use the method having both integer arguments
		System.out.println(addUp(1,4));
		
		//Following call will use the method having both string arguments
		System.out.println(addUp("one","three"));
		
		//Following call is permitted though there is no method with an int and double arguments because the int can also be considered as a whole double number.
		System.out.println(addUp(2,3.5));
	
		//The following call is not permitted as there is no method having an int and string argument which leads to compilation error
		// System.out.println(addUp(1,"three"));
			
	}
	
	public static int addUp(int num1, int num2)
	{
		System.out.println("Executing int method");
		return num1+num2;
	}
	
	public static double addUp(double num1,double num2)
	{
		
	System.out.println("Executing double method");	
	return num1+num2;
	
	}
	
	public static int addUp(String num1,String num2)
	{
		System.out.println("Executing string method");
		return toNumber(num1)+toNumber(num2);
	}
	
	public static int toNumber(String num)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].equalsIgnoreCase(num))
				return i;
		}
	/*	switch(num)
		{
		case "zero" : return 0;
		case "one" : return 1;
		case "teo" : return 2;
		case "three" : return 3;
		case "four" : return 4;
		case "five" : return 5;
		case "six" : return 6;
		case "seven" : return 7;
		case "eight" : return 8;
		case "nine" : return 9;
		case "default" : return -1;
		}
		*/
		return -1;
	}

}
