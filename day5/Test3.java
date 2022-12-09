package day5;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0;; i++) {
			
			try {
				System.out.println("Enter a numerator: ");
				String num = sc.next();
				
				System.out.println("Enter a divisor: ");
				int div = sc.nextInt();
				
				if (num.equalsIgnoreCase("Q")) {
					System.out.println("End");
					break;
				}
				System.out.println(Integer.parseInt(num)/div);
			
			} catch (Exception e) {
				
				System.out.println("Poor Input Data");
				
			}
		}
		sc.close();
	}

}
