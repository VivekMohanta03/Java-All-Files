import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        long n = sc.nextLong();
        int c = 0;
        while (n > 0) {
            c++;
            n /= 10;
        }
        System.out.println("The number of digits in the number is : " + c);
        sc.close();
    }
}