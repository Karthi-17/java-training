package day8;

import java.io.*;
import java.util.*;

public class Test2 {
	public static void CountWords(String filename, Map< String, Integer> words) throws FileNotFoundException
	{
		Scanner file=new Scanner (new File(filename));
		while(file.hasNext())
		{
			String word=file.next();
			Integer count=words.get(word);
			if(count!=null)
				count++;
			else
				count=1;
			words.put(word,count);
		}
		file.close();
	}
	public static void main(String[] args) throws FileNotFoundException
	{
		Map<String,Integer> words=new HashMap<String, Integer>();
		CountWords("/Users/KarthickDharshan/eclipse-workspace/Java/src/day8/File2",words);
		System.out.println(words);   
	}
}
