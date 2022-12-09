package day7;

class T1 implements Runnable {

	@Override
	public void run() {
		System.out.println("T1");
	}
	
}

class T2 implements Runnable {

	@Override
	public void run() {
		System.out.println("T2");
	}
	
}

public class Test1 {

	public static void main(String[] args) {
		
		Thread th1 = new Thread(new T1());
		th1.setName("Karthick");
		System.out.println(th1.getName());
		
		Thread th2 = new Thread(new T2());
		th2.setName("Dharshan");
		System.out.println(th2.getName());
	}

}
