import java.util.Scanner;

public class Pattern_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input n : ");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            //numbers
            for(int j = 1;j<=i;j++){
                System.out.print(j+" ");
            }

            //space
            for(int j =1;j<=2*(n-i);j++){
                System.out.print("  ");
            }

            //numbers
            for(int j = i;j>=1;j--){
                if(j!=i){
                    System.out.print(" "+j);
                }else{
                    System.out.print(j);
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
