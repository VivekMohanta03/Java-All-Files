import java.util.Scanner;

public class Pattern_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input n : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (char j = 'A'; j <= 'A'+(i-1); j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}
