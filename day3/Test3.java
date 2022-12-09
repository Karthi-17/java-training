package day3;

class base {
	
	String method() {
		return "Wow";
	}
}

class derived {
	
	public void used() {
		base z = new base();
		System.out.println("Base says, " + z.method());
	}
}

public class Test3 {

	public static void main(String[] args) {
		derived d = new derived();
		d.used();
		base b = new base();
		System.out.println(b.method());
	}

}
