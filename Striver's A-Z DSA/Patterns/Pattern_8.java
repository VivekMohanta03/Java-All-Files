import java.util.Scanner;

public class Pattern_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input n : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            // printing space
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }

            // printing stars
            for (int j = 1; j <= 2*(n-i)+1; j++) {
                System.out.print("*");
            }

            // printing space
            // for (int j = 1; j <= i - i; j++) {
            //     System.out.print(" ");
            // }
            System.out.println();
            sc.close();
        }
    }
}
