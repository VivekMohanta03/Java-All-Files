package TwoD_Arrays;

import java.util.Scanner;

public class FindIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Enter value: ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the element to be searched in the matrix: ");
        int n = sc.nextInt();
        findIndex(arr, n, r, c);
        sc.close();
    }

    static void findIndex(int arr[][], int n, int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if(arr[i][j]==n){
                    System.out.println("Element is found at row "+(i+1)+" and column "+(j+1));
                }
            }
        }
    }
}
