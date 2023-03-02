import java.util.Arrays;
import java.util.Scanner;

public class Q3_KthMinMaxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int l = sc.nextInt();
        int[] arr = new int[l];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element : ");
            arr[i] = sc.nextInt();
        }
        printArr(arr);
        System.out.println("Enter k for min and max : ");
        int k = sc.nextInt();
        kthminmax(arr, k);
        sc.close();
    }

    static void printArr(int arr[]) {
        System.out.print("The array is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void kthminmax(int arr[],int k){
        Arrays.sort(arr);
        System.out.println("kth minimum element is : "+arr[k-1]);
        System.out.println("kth maximum element is : "+arr[arr.length-k]);
    }
}
