package day6;

import java.util.*;

public class Test3 {

	public static void main(String[] args) {

	        String s;

	        Scanner sc=new Scanner(System.in);

	        System.out.println("Enter the paragraph:"); 

	        s=sc.nextLine();

	        String[] words = s.split("[ ,.]");
	        
	        ArrayList<String> al = new ArrayList<>(Arrays.asList(words));
	        
	        System.out.println("Printing the paragraph as a list");
	        
	        System.out.println(al);
	        
	        Collections.reverse(al);
	        
	        System.out.println("Reversed the paragraph");
	        
	        System.out.println(al);
	        
	        for (int i = 0; i < words.length; i++) {

	            int l = words[i].length()-1;

	            if (words[i].endsWith("s")) {

	                words[i] = words[i].toUpperCase();

	            }

	        }
	        
	        System.out.println("Capitalized Plural words");

	        System.out.println(Arrays.toString(words));
	        
	        Collections.reverse(al);
	        
	        for(int i=0;i<al.size();i++){
	            if(al.get(i).length()%2!=0){
	                al.remove(al.get(i));
	            }
	        }
	        
	        System.out.println("Removed the odd size words");
	        
	        System.out.println(al);

	}

}
