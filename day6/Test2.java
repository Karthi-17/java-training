package day6;

import java.util.*;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string");
        String str = sc.nextLine();
        
        String[] strArray = str.split(" ");
        
        String str1 = "";
        
        for (int i = 0; i < strArray.length; i++) {
			str1 += strArray[i];
		}
        
        str = str1;
        
        char[] charArray = str.toCharArray();
        
        HashSet s = new HashSet();
        
        for(int i=0; i<charArray.length; i++) {
            s.add(charArray[i]);
        }
        
        
        for(int i=0; i<s.size(); i++) {
            System.out.print(s.toArray()[i]+"=");
            ArrayList al = new ArrayList();
            char c=(Character) s.toArray()[i];
            
            for(int j=0;j<charArray.length; j++) {
                if(c==charArray[j]) {
                    al.add(j);
                }
            }
            if (i==s.size()-1) {
            	System.out.print(al+ " ");
			} else {
				System.out.print(al+ ", ");
			}
        }
        
        sc.close();
	}

}
