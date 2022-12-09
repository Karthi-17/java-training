package day6;

import java.util.*;

public class Test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> al = new ArrayList<>();
		
		System.out.println("Enter the number of strings");
		int a = sc.nextInt();
		
		for (int i = 0; i < a; i++) {
			System.out.println("Enter a string");
			String str = sc.next();
			
			al.add(str);
			al.add("*");
		}
		
		System.out.println(al);
		
		System.out.println("Enter the string to search");
		String search = sc.next();
		
		System.out.println("The given string is at the index: " + getIndex(al, search));
		
		sc.close();
	}
	
	public static int getIndex(ArrayList<String> s, String search) {
		if (s.contains(search)) {
			return s.indexOf(search);
		}
		return -1;
	}

}
