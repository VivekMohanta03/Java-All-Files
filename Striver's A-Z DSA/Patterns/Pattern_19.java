import java.util.Scanner;

public class Pattern_19 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int s = 0;
        for(int i = 0;i<n;i++){
            //stars
            for(int j = 1;j<=n-i;j++){
                System.out.print("*");
            }

            //spaces
            for(int j = 1;j<=s;j++){
                System.out.print(" ");
            }

            //stars
            for(int j =1;j<=n-i;j++){
                System.out.print("*");
            }
            s +=2;
            System.out.println();
        }
        s = 2*n -2;
      for(int i=1;i<=n;i++){
          
          //for printing the stars in the row.
          for(int j=1;j<=i;j++){
              System.out.print("*");
          }
          
          //for printing the spaces in the row.
          for(int j=0;j<s;j++){
              System.out.print(" ");
          }
          
          //for printing the stars in the row.
          for(int j=1;j<=i;j++){
              System.out.print("*");
          }
          s -= 2;
          System.out.println();
      }
        sc.close();
    }
}
