// Multithreaded Banking Transactions on a Joint Account

class JointAccount {
    private int balance;

    public JointAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void deposit(int amount, String name) {
        System.out.println(name + " is trying to deposit: " + amount);
        int newBalance = balance + amount;
        try { 
            Thread.sleep(500); 
        } 
        catch (InterruptedException e) {}
        balance = newBalance;
        System.out.println(name + " deposited " + amount + ". New balance: " + balance);
    }

    // Synchronized withdrawal
    public synchronized void withdraw(int amount, String name) {
        System.out.println(name + " is trying to withdraw: " + amount);
        if (balance >= amount) {
            int newBalance = balance - amount;
            try { 
                Thread.sleep(500); 
            } 
            catch (InterruptedException e) {}
            balance = newBalance;
            System.out.println(name + " withdrew " + amount + ". New balance: " + balance);
        } else {
            System.out.println("INSUFFICIENT BALANCE for " + name + ". Current balance: " + balance);
        }
    }

    public int getBalance() {
        return balance;
    }
}

class BankingTask implements Runnable {
    private JointAccount account;
    private String customerName;

    public BankingTask(JointAccount account, String customerName) {
        this.account = account;
        this.customerName = customerName;
    }

    @Override
    public void run() {
        account.deposit(1000, customerName);
        account.withdraw(500, customerName);
        account.withdraw(800, customerName);
    }
}

public class MultithreadedBanking {
    public static void main(String[] args) {
        JointAccount jointAccount = new JointAccount(1000); // initial balance

        Thread t1 = new Thread(new BankingTask(jointAccount, "Person-1"));
        Thread t2 = new Thread(new BankingTask(jointAccount, "Person-2"));

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Balance in Joint Account: " + jointAccount.getBalance());
    }
}
