import java.util.Scanner;

public class Pattern_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input n : ");
        int n = sc.nextInt();
        for(int i = n;i>0;i--){
            for(int j = 1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
