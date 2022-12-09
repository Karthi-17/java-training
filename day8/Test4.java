package day8;

import java.io.*;
import java.util.Scanner;

public class Test4 {
	public static void copy(File a, File b) throws Exception {
        FileInputStream input = new FileInputStream(a);
        FileOutputStream output = new FileOutputStream(b);
        try {
            int i;
            while ((i = input.read()) != -1) {
                output.write(i);
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            if (input != null) {
                input.close();
            }
            if (output != null) {
                output.close();
            }
            System.out.println(" File has been copied");
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter source file name:");
        String in = sc.nextLine();
        System.out.println("Enter Destination file name:");
        String out = sc.nextLine();
        copy(new File(in), new File(out));
    }
}

// /Users/KarthickDharshan/eclipse-workspace/Java/src/day8/File4a
