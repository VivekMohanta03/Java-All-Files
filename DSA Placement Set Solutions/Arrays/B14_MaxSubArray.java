import java.util.Scanner;

public class B14_MaxSubArray {
    // subarray with the largest sum and return its sum
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int l = sc.nextInt();
        int arr[] = new int[l];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("The maximum subArray sum is: " + maxSubarray(arr));
        sc.close();
    }

    static int maxSubarray(int arr[]) {
        int opt = arr[0];
        int max = opt;
        for (int i = 1; i < arr.length; i++) {
            opt = Math.max(opt + arr[i], arr[i]);
            max = Math.max(max, opt);
        }
        return max;
    }
}
