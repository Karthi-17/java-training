package day5;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0, count, validCount = 0;
		System.out.println("Enter the number of values: ");
		count = sc.nextInt();
		for (int i = 1;; i++) {
			System.out.println("Enter the number " + i + " : ");
			String str = sc.next();
			try {
//				Integer a = sc.nextInt();
				Integer a = Integer.parseInt(str);
				sum += a;
				validCount++;
			} catch (Exception e) {
				System.out.println("Invalid Input");
			}
			if(validCount==10) {
				break;
			}
		}
		System.out.println("The average of the marks: " + sum/count);
		sc.close();
	}

}
