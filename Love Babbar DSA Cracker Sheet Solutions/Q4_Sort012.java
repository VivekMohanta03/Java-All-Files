import java.util.Scanner;

public class Q4_Sort012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int l = sc.nextInt();
        int[] arr = new int[l];
        System.out.println("Enter only 0s, 1s and 2s: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element: ");
            arr[i] = sc.nextInt();
        }
        printArr(arr);
        sortColors(arr);
        printArr(arr);
        sc.close();

    }

    static void printArr(int arr[]) {
        System.out.print("The array is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void sortColors(int[] nums) {
        int lo = 0;
        int hi = nums.length - 1;
        int mid = 0;
        int temp;
        while (mid <= hi) {
            switch (nums[mid]) {
                case 0:
                    temp = nums[lo];
                    nums[lo] = nums[mid];
                    nums[mid] = temp;
                    lo++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = nums[mid];
                    nums[mid] = nums[hi];
                    nums[hi] = temp;
                    hi--;
                    break;
            }
        }
    }
}
