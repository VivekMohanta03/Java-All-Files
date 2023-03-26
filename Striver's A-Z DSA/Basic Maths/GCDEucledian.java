import java.util.Scanner;

public class GCDEucledian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A : ");
        int a = sc.nextInt();
        System.out.println("Enter B : ");
        int b = sc.nextInt();
        int ans = GCD(a, b);
        System.out.println("The GCD of a and b is : " + ans);
        sc.close();
    }

    static int GCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return GCD(b, a % b);
    }
}
