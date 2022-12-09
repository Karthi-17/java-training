package day7;

public class Test3 {
	
	Object world = new Object();
    Object hello = new Object();
    
    public static void main(String[] args) throws InterruptedException
    {
            Runnable helloTask = new Runnable()
            {
                public void run()
                {
                    try {
                    	new Test3().printHello();
					} catch (Exception e) {}
                }
            };
            Runnable worldTask = new Runnable()
            {
                public void run()
                {
                    try {
                    	new Test3().printWorld();
					} catch (Exception e) {}
                }
            };
            Thread t1 = new Thread(helloTask);
            Thread t2 = new Thread(worldTask);
            
            t1.start();
            t1.join();
            t2.start();
            t2.join();
    }
    public void printHello() throws InterruptedException
    {
    	for (int i = 0;; i++) {
            System.out.println("Hello");
            Thread.sleep(1000);
		}
    }
    public void printWorld() throws InterruptedException
    {
        for (int i = 0;; i++) {
            System.out.println("QA ACE 2023");
            Thread.sleep(1000);
		}
    }

}
