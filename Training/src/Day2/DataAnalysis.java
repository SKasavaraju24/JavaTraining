package Day2;

import java.util.Scanner;

public class DataAnalysis {
	
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of items");
		int num= Integer.parseInt(s.nextLine());
		int arr[]= new int[num];
		
		System.out.println("Enter the numbers");
		for(int i=0;i<num;i++)
		{
			arr[i]= Integer.parseInt(s.nextLine());
		}
		
		int total=0,smallest=arr[0],largest=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			total+=arr[i];
			if(smallest>arr[i])
				smallest=arr[i];
			if(largest<arr[i])
				largest=arr[i];
			
		}
		double mean = (double)total/arr.length;
		System.out.println("Mean : "+mean);
		System.out.println("Largest Number : "+largest);
		System.out.println("Smallest Number :" + smallest);
		
	}

}
