package TwoD_Arrays;

import java.util.Scanner;

public class SpiralMatrix {
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
        System.out.println("The 2 D array is:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // spiral order
        System.out.print("The matrix in spiral order is: ");
        int rowStart = 0;
        int rowEnd = r - 1;
        int colStart = 0;
        int colEnd = c - 1;

        // to print spiral order matrix
        while (rowStart <= rowEnd && colStart <= colEnd) {
            for (int col = colStart; col <= colEnd; col++) {
                System.out.print(arr[rowStart][col] + " ");
            }
            rowStart++;

            for (int row = rowStart; row <= rowEnd; row++) {
                System.out.print(arr[row][colEnd] + " ");
            }
            colEnd--;

            for (int col = colEnd; col >= colStart; col--) {
                System.out.print(arr[rowEnd][col] + " ");
            }
            rowEnd--;
            for (int row = rowEnd; row >= rowStart; row--) {
                System.out.print(arr[row][colStart] + " ");
            }
            colStart++;
        }
        sc.close();
    }
}
