package day7;

class Thread81 extends Thread
{
	public void run()
	{
		int a=0, b=1, c=0, n=10;
		System.out.println("Fibonacci series:");
		while(n>0)
		{
			System.out.println(c);
			a=b;
			b=c;
			c=a+b;
			n=n-1;
		}
	}
}

class Thread82 extends Thread
{
	public void run()
	{
		System.out.println("Reverse is");
		for(int i=10; i>0; i--)
		{
			System.out.println(i);
		}
	}
}

public class Test8 {
	public static void main(String args[]) throws InterruptedException
	{
		Thread81 t1=new Thread81();
		t1.start();
		
		t1.sleep(5000);
		
		Thread82 t2=new Thread82();
		t2.start();
	}
}
