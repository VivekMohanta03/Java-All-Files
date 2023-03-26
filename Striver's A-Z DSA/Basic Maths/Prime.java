import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        boolean ans = (isPrime(n));
        if (n != 1 && ans == true) {
            System.out.println(n + " is a Prime Number");
        } else {
            System.out.println(n + " is not a Prime Number");
        }
        sc.close();
    }

    static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
