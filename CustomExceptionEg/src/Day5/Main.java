package Day5;

import java.util.Scanner;

public class Main {
	
	public enum Month{ JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER};
	
	static int[] days= new int[12];
	
	public static void main(String args[])
	{
		setDays();
		boolean run=true;
		String input;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter month and day");
		while(!((input=s.nextLine()).equalsIgnoreCase("quit")))
		{
		try {
			convertAndCheck(input.split(" ")[0],Integer.parseInt(input.split(" ")[1]));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BadMonth e) {
			e.printStackTrace();
			continue;
		} catch (BadDay e) {
			e.printStackTrace();
			continue;
		}
		}
	
		
	}
	
    public static void setDays()
    {
    	for(int i=0;i<12;i++)
		{
			if(i==1)
			 days[i]= 28;
			else if(i==0||i==2||i==4||i==6||i==7||i==9||i==11)
			 days[i]=31;
			else
			days[i]=30;
		
		}
    }
    
	public static void convertAndCheck(String month, int day) throws BadMonth, BadDay
	{
		int monthNum;
		try{
			monthNum=Month.valueOf(month).ordinal();
		}
		catch(Exception e)
		{
			throw new BadMonth(e);
		}
		
		if(day > days[monthNum] )
			throw new BadDay("The day "+day+" does not exist in "+ month);
	}

}
