package day8;

import java.io.*;
import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) throws IOException {
		
        FileOutputStream a=new FileOutputStream("/Users/KarthickDharshan/eclipse-workspace/Java/src/day8/File3");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of Multiples:");
        int m=sc.nextInt();
        for(int i=1;i<=10;i++){
            String table=m + " * " + i + " = " + (m*i) + "\n" ;
            a.write(table.getBytes());
        }
        System.out.println("File has been updated");
    }
}