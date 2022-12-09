package day7;

import java.util.LinkedList;

class ProducerConsumer {
	LinkedList ll = new LinkedList();
    int capacity = 2;
    public void produce() throws InterruptedException
    {
    	int value = 0;
        while (true) {
            synchronized (this)
            {
                while (ll.size() == capacity)
                    wait();
                System.out.println("Producer produced-" + value);
                ll.add(value++);
                notify();
                Thread.sleep(1000);
            }
        }
    }
    public void consume() throws InterruptedException
    {
    	while (true) {
            synchronized (this)
            {
                while (ll.size() == 0)
                    wait();
                int val = (int) ll.removeFirst();
                System.out.println("Consumer consumed-" + val);
                notify();
                Thread.sleep(1000);
            }
        }
    }
}

public class Test6 {

	public static void main(String[] args) {
        ProducerConsumer pc = new ProducerConsumer();
        
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run()
            {
                try {
                    pc.produce();
                }
                catch (InterruptedException e) {}
            }
        });
        
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run()
            {
                try {
                    pc.consume();
                }
                catch (InterruptedException e) {}
            }
        });
        
        t1.start();
        t2.start();
	}

}
