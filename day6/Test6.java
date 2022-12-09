package day6;

import java.util.*;

public class Test6 {

	public static void main(String[] args) {
		// create an empty linked list

		LinkedList<String> l_list = new LinkedList<>();
		
		LinkedList<String> rev_list = new LinkedList<>();

		// use add() method to add values in the linked list

		l_list.add("Red");
		l_list.add("Green");
		l_list.add("Black");
		l_list.add("White");
		l_list.add("Pink");

		for (String element : l_list) {
			System.out.println(element);
		}
		System.out.println();
		
		l_list.sort(null);
		
		for (String element : l_list) {
			System.out.println(element);
		}
		
		System.out.println();
		
		for (Iterator iterator = l_list.iterator(); iterator.hasNext();) {
			rev_list.add(l_list.pollLast());
		}
		
		for (String element : rev_list) {
			System.out.println(element);
		}

	}
	
}
