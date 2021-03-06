package Day8;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Map<String,Integer> wordCount= new HashMap<>();
		
		BufferedReader br = Files.newBufferedReader(Paths.get("book.txt"));
		
		String line;
		while((line=br.readLine())!=null)
		{
		String[] words= line.split("\\W+");
		for(int i=0;i<words.length;i++)
		{
			words[i]=words[i].toLowerCase();
			if(wordCount.containsKey(words[i]))
			wordCount.put(words[i],wordCount.get(words[i])+1);
			else
				wordCount.put(words[i],1);
		}
		
		}
		
		for(Entry<String,Integer> entry : wordCount.entrySet())
        System.out.println("The word "+entry.getKey()+" occurs "+entry.getValue()+" times");
	}

}
