// f(x) = ax^2 + bx + c

package day3;

class QuadraticExpression {
	
	int a, b, c;
	
	QuadraticExpression() {
		a = 1;
		b = 1;
		c = 1;
	}
	
	QuadraticExpression(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	public int getC() {
		return c;
	}
	
	public void modifyValues(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public int findEquationResult(int x) {
		return (int)(a*Math.pow(x, 2)+(b*x)+c);
	}
}

public class Test4 {

	public static void main(String[] args) {
		QuadraticExpression q1 = new QuadraticExpression();
		QuadraticExpression q2 = new QuadraticExpression(10, 6, 8);
		
		System.out.println("a = " + q1.getA());
		System.out.println("b = " + q1.getB());
		System.out.println("c = " + q1.getC());
		
		System.out.println();
		
		System.out.println("a = " + q2.getA());
		System.out.println("b = " + q2.getB());
		System.out.println("c = " + q2.getC());
		
		System.out.println();
		
		q1.modifyValues(5, 6, 4);
		
		System.out.println("a = " + q1.getA());
		System.out.println("b = " + q1.getB());
		System.out.println("c = " + q1.getC());
		
		System.out.println();
		
		System.out.println(q1.findEquationResult(2));
		System.out.println(q2.findEquationResult(2));
	}

}
