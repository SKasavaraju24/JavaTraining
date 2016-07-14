package Day8;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Set<String> list= new HashSet<>();
		BufferedReader br = Files.newBufferedReader(Paths.get("book.txt"),StandardCharsets.UTF_8);
	
		String line;
		while((line=br.readLine())!=null)
		{
		String[] words= line.split("\\W+");
		for(int i=0;i<words.length;i++)
		list.add(words[i].toLowerCase());
		
		}
		
	  for(String word:list)
		  System.out.println(word);

	}

}
