import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int original = n;
        int temp = n;
        int c = 0;
        int res = 0;
        while (original != 0) {
            c++;
            original = original / 10;
        }
        while (n > 0) {
            res = res + (int) Math.pow((n % 10), c);
            n = n / 10;
        }
        if (temp == res) {
            System.out.println(temp + " is an Armstrong Number");
        } else {
            System.out.println(temp + " is not an Armstrong Number");
        }
        sc.close();
    }
}
