package Day5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	static String input;
	static String output;
	
	public static void main(String[] args) {
	
	  Scanner inFile;	
	  Scanner s= new Scanner(System.in);
		input(s);
		output(s);

		while(true)
		{
			
		try{
		inFile = new Scanner(new File(input));
	    }
		catch (IOException e) {
			input(s);
			continue;
		}
		break;
		}
		
		
		while(true)
		{
		try {
			FileWriter outFile = new FileWriter(output);
			copyFile(inFile,outFile);
		
		}catch (IOException e) {
			
			e.printStackTrace();
			output(s);
			continue;
		}
		
		break;
		}
			
	
	
		}
	private static void copyFile(Scanner inFile, FileWriter outFile) throws IOException {
	
		while(inFile.hasNext())
		outFile.write(inFile.nextLine());
		
		outFile.flush();
		
	}
	
   private static void input(Scanner s)
	{
		System.out.println("Enter the first file name:");
		input= s.nextLine();
		
	}
	
	private static void output(Scanner s)
	{
		System.out.println("Enter the second file name:");
		output= s.nextLine();
	}

}
