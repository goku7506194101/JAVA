import java.util.*;

class primenumber {
    public static void main(String[] args) {
        int n, i, status=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        if(n <= 1) {
            System.out.println(n + " is not a prime number.");
            return;
        }
        for(i=2; i<=n/2; i++) {
            if(n%i == 0) {
                status = 1;
                break;
            }
        }
        if(status == 0)
            System.out.println(n + " is a prime number.");
        else
            System.out.println(n + " is not a prime number.");
    }
}