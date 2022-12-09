package day5;

import java.util.Scanner;

//	Creating a class named AgeException and extending it to RuntimeException class to create a custom runtime exception

class AgeException extends RuntimeException {
	
}

//	Creating a class named Vote to have the variables and methods needed for Voting

class Vote {
	
//	Initializing an int variable to store the age of the voter
	int age;
	
//	Default constructor of class Vote
	Vote() {}
	
//	Parameterized constructor of class Vote
	Vote(int age) {
		if (age<0) {
			
//	Throwing an object of AgeException if the age that the user give is less than 0
			throw new AgeException();
		} else {
			this.age = age;
		}
	}
	
//	Creating a method to find if the voter is eligible for voting
	public void checkEligibility() 
	{
		if (this.age>18) {
			System.out.println("Eligible");
		} else {
			System.out.println("Not Eligible");
		}
	}
}

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age: ");
		
//	Creating an empty object of Vote class
		Vote v = new Vote();
		try {
//	Initializing the object with parameterized constructor by passing the integer value that the user inputs
			v = new Vote(sc.nextInt());
		} catch (Exception e) {
			System.out.println("Age cannot be negative");
		}
//	Calling the checkEligibility() to check if the voter is eligible for voting
		v.checkEligibility();
		sc.close();
	}

}
