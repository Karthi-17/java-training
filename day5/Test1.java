package day5;

// Importing IOException class from the java.io package
import java.io.IOException;

class Test1A {
	
//	Creating a method inside the Test1A class
	public void ioException() throws IOException {
		
//	Throwing an IOException object with the throw keyword
		throw new IOException();
	}
}

public class Test1 {

	public static void main(String[] args) throws IOException {
		Test1A test = new Test1A();
		try {
			test.ioException();
		}
		catch(IOException e) {
			System.out.println("IO Exception");
		}
	}

}
