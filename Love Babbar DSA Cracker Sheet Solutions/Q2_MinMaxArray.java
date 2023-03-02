import java.util.Scanner;

public class Q2_MinMaxArray {
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
        minmax(arr);
        sc.close();
    }

    static void printArr(int arr[]) {
        System.out.print("The array is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void minmax(int arr[]) {
        if (arr.length > 1) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min)
                    min = arr[i];
                if (arr[i] > max)
                    max = arr[i];
            }
            System.out.println("The minimum element in the array is : " + min);
            System.out.println("The maximum element in the array is : " + max);
        }else{
            System.out.println("The minimum and maximum element in the array is : " + arr[0]);
        }
    }
}
