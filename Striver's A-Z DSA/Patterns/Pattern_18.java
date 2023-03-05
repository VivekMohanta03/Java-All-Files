import java.util.Scanner;

public class Pattern_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            for(char j = (char)(int)('A'+n-i);j<=(char)(int)('A'+n-1);j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
