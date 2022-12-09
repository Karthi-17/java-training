package day8;

import java.io.FileInputStream;

public class Test1 {
	public static void main(String[] args)
	{
		try {
			FileInputStream a = new FileInputStream("/Users/KarthickDharshan/eclipse-workspace/Java/src/day8/File1");
			int count = 0;
			while ((count = a.read())!=-1)
			{
				System.out.print((char) count);
			}
			a.close();
		}
		catch (Exception e){}

	}
}