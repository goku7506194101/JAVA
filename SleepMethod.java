// Write a program to calculate sum and factorial using sleep method
class SumThread extends Thread {
    private int n;

    public SumThread(int n) {
        this.n = n;
    }

    public void run() {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Sum of numbers from 1 to "+ n +" = "+ sum);
    }
}

class FactorialThread extends Thread {
    private int n;

    public FactorialThread(int n) {
        this.n = n;
    }

    public void run() {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Factorial of " + n + " = " + fact);
    }
}

public class SleepMethod {
    public static void main(String[] args) {
        int number = 5;

        SumThread sumThread = new SumThread(number);
        FactorialThread factorialThread = new FactorialThread(number);
        sumThread.start();
        factorialThread.start();
    }
}