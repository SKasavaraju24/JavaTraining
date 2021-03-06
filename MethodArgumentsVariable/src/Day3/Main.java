package Day3;

public class Main {

	static String arr[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
	public static void main(String[] args) {
	
		int a[] = new int[0];
	    int a1[]={1};
	    int a2[]={1,5};
	    int a4[]={2,4,6,8};
		double b[] = new double[0] ;
		double b1[]={2.5};
	    double b2[]={1.5,5.5};
	    double b4[]={2.25,4.25,6.25,8.25};
		String c[] = new String[0];
		String c1[]={"Five"};
		String c2[]={"Four","Six"};
		String c4[]={"Two","Four","Six","Eight"};
	
		//Following tests for 0 elements 
		System.out.println(addUp(a));
		System.out.println(addUp(b));
		System.out.println(addUp(c));
	 
		
	    System.out.println(addUp(a1));
		System.out.println(addUp(a2));
		System.out.println(addUp(a4));
		
		System.out.println(addUp(b1));
		System.out.println(addUp(b2));
		System.out.println(addUp(b4));
		
		System.out.println(addUp(c1));
		System.out.println(addUp(c2));
		System.out.println(addUp(c4));
			
	}
	
	public static int addUp(int num[])
	{
		System.out.println("Executing int method");
		int sum=0;
		for(int i=0;i<num.length;i++)
			sum+=num[i];
		return sum;
	}
	
	public static double addUp(double num[])
	{
		
	System.out.println("Executing double method");	
	double sum=0.0;
	for(int i=0;i<num.length;i++)
		sum+=num[i];
	return sum;
	
	}
	
	public static int addUp(String num[])
	{
		System.out.println("Executing string method");
		int sum=0;
		for(int i=0;i<num.length;i++)
			sum+=toNumber(num[i]);
		return sum;
	}
	
	public static int toNumber(String num)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].equalsIgnoreCase(num))
				return i;
		}
		return 0;
	}

}
