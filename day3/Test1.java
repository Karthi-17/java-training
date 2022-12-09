package day3;

class A {
	public int a = 10;
	int b = 20;
	protected int c = 30;
	private int d = 40;
	
	public void m1() {
		System.out.println("public method");
	}
	
	void m2() {
		System.out.println("default method");
	}
	
	protected void m3() {
		System.out.println("protected method");
	}
	
	private void m4() {
		System.out.println("private method");
	}

}

public class Test1 {

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.a);
		System.out.println(a.b);
		System.out.println(a.c);
//		System.out.println(a.d);
		a.m1();
		a.m2();
		a.m3();
//		a.m4();
	}

}
