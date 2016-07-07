package Day2;

import java.util.Scanner;

public class Zeller {
	
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the date as MM-DD-YYYY");
		String date;
		while((date=s.nextLine()).equalsIgnoreCase("quit")!=true)
		{
			String split[]=date.split("-");
			int month= Integer.parseInt(split[0]);
			int day = Integer.parseInt(split[1]);
			int year = Integer.parseInt(split[2]);
			if(month==1||month==2)
			{
				month+=12;
				year--;
			}
	        int a= 13*(month+1)/5;
	        int b= year/4;
	        int temp=year/100;
	        int c=6*temp;
	        int d=year/400;
	
	        int remainder = (a+b+c+d+year+day)%7;
	        String dayOfWeek="";
	        switch(remainder)
	        {
	        case 0: dayOfWeek="Saturday"; break;
	        case 1: dayOfWeek="Sunday"; break;
	        case 2: dayOfWeek="Monday"; break;
	        case 3: dayOfWeek="Tuesday"; break;
	        case 4: dayOfWeek="Wednesday"; break;
	        case 5: dayOfWeek="Thursday"; break;
	        case 6: dayOfWeek="Friday"; break;
            default : System.out.println("Incorrect Reminder"); break;
	        }
	        
	        System.out.println("The day of the week is : "+dayOfWeek);
			
		}
	}

}
