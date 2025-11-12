import java.util.*;

class fibonacci {
    public static void main(String[] args) {
        int n, f1=0, f2=0, term=1, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        n = sc.nextInt();
        System.out.println("Fibonacci Series: ");
        for(i=1; i<=n; i++) {
            System.out.print(term + " ");
            f1 = f2;
            f2 = term;
            term = f1 + f2;
        }
    }   
}