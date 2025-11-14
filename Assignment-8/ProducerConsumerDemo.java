// File name: ProducerConsumerDemo.java

class Company {
    int n;
    boolean produced = false; // flag to track if item is produced

    // Producer method
    synchronized void produce(int item) {
        while (produced) {
            try {
                wait(); // wait until the item is consumed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        n = item;
        System.out.println("Produced: " + n);
        produced = true;
        notify(); // notify consumer
    }

    // Consumer method
    synchronized void consume() {
        while (!produced) {
            try {
                wait(); // wait until item is produced
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumed: " + n);
        produced = false;
        notify(); // notify producer
    }
}

// Producer thread
class Producer extends Thread {
    Company c;
    Producer(Company c) {
        this.c = c;
    }

    public void run() {
        int i = 1;
        while (i <= 5) {
            c.produce(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}

// Consumer thread
class Consumer extends Thread {
    Company c;
    Consumer(Company c) {
        this.c = c;
    }

    public void run() {
        int i = 1;
        while (i <= 5) {
            c.consume();
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        Company comp = new Company();

        Producer p = new Producer(comp);
        Consumer c = new Consumer(comp);

        p.start();
        c.start();
    }
}
