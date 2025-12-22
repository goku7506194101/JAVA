class MyThread extends Thread {

    MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Thread Name: " + getName() + ", Priority: " + getPriority());
    }
}

public class MultiThread {
    public static void main(String[] args) {

        MyThread t1 = new MyThread("Thread-1");
        MyThread t2 = new MyThread("Thread-2");
        MyThread t3 = new MyThread("Thread-3");

        t1.setPriority(Thread.MIN_PRIORITY);   
        t2.setPriority(Thread.NORM_PRIORITY);  
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}