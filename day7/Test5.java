package day7;

class Count extends Thread {
	public void run() {
		for(int i = 1; i<=50; i++) {
			if (i%10==0) {
				System.out.println("Hello");
			} else {
				System.out.println(i);
			}
			try {
				Thread.sleep(1000);
			} catch(Exception e) {}
		}
	}
}

public class Test5 {

	public static void main(String[] args) {
		Count c = new Count();
		c.run();
	}

}
