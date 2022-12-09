package day6;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
		ArrayList<String> theatres = new ArrayList<>();
		theatres.add("A");
		theatres.add("B");
		theatres.add("C");
		theatres.add("D");
		theatres.add("E");
		theatres.add("F");
		theatres.add("G");
		ArrayList<String> closed = new ArrayList<>();
		closed.add("C");
		closed.add("D");
		closed.add("F");
		theatres.removeAll(closed);
		System.out.println("Open theatres: " + theatres.toString());
	}

}
