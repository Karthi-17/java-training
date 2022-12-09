package day3;

class Protected {
	protected int a = 10;
}

public class Test2 {

	public static void main(String[] args) {
		Protected a = new Protected();
		System.out.println(a.a);
		a.a = 20;
		System.out.println(a.a);
	}

}
