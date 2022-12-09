package day6;

import java.util.*;

public class Test5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		System.out.println("Enter the number of values");
		int n = sc.nextInt();
		
		for (int i = 0, k = 1; i < n; i++, k++) {
			System.out.println("Enter the key " + k);
			String key = sc.next();
			System.out.println("Enter the value" + k);
			String value = sc.next();
			map.put(key, value);
		}

		System.out.println(map);
		
		System.out.println("Enter the value to search: ");
		String str = sc.next();

		try {
			Integer i = Integer.parseInt(str);
			System.out.println("Wrong Input");
		} catch (Exception e) {
			if(map.containsValue(str)){
				System.out.println("yes");
			}
			else if(map.containsKey(str)) {
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
		}
	}

}
