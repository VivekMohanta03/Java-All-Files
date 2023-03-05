import java.util.Scanner;

public class Pattern_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input n : ");
        int n = sc.nextInt();
        int start = 0;
        for (int i = 1; i <= n; i++) {
            if(i%2!=0){
                start = 1;
            }else{
                start = 0;
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(start+" ");
                start = 1-start;
            }
            System.out.println();
            sc.close();
        }
    }
}
