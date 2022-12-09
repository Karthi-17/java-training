package day7;

import java.util.Scanner;

class Thread1 extends Thread {
	public void run() {
		for (int i = 1; i <= 100; i++) {
			if (i%2!=0) {
				System.out.println("T1");
				System.out.println(i);
			}
		}
	}
}

class Thread2 extends Thread {
	public void run() {
		for (int i = 1; i <= 100; i++) {
			if (i%2==0) {
				System.err.println("T2");
				System.err.println(i);
			}
		}
	}
}

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		sc.close();
	}

}
