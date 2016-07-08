package Day3;

public class Reading {

	String dayOfWeek;
	int hourofDay;
	int temperature;
	int windspeed;
	
	public Reading(String input)
	{
		
		String[] elements = input.split(", ");
		dayOfWeek=elements[0];
		hourofDay=Integer.parseInt(elements[1]);
		temperature=Integer.parseInt(elements[2]);
		windspeed=Integer.parseInt(elements[3]);
		
	}
	
	public String rateTemperature()
	{
		if(temperature<55)
		  return "cold";
		else if(temperature>=80)
			return "hot";
		else if((temperature>=55)&&(temperature<65))
			return "mild";
		else
			return "warm";
	}
	
	public String getTime()
	{
	   String time="";
		switch(hourofDay)
		{
		case 9: time= " morning"; break;
		case 15: time =" afternoon"; break;
		case 21: time= " evening"; break;
		}
		
		return dayOfWeek+time;
		
	}
	
}
