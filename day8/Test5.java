package day8;

import java.io.FileWriter;

public class Test5 {
	public static void main(String[] args)
	{
		String path = "/Users/KarthickDharshan/eclipse-workspace/Java/src/day8/File5";
		String text = "I am adding this text";
		try
		{
			FileWriter fw = new FileWriter(path, true);
			fw.write(text);
			fw.close();
		}
		catch(Exception e) {}
	}
}
