import java.util.Scanner;

public class Q5_MoveNegative {
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
        moveNeg(arr);
        sc.close();
    }

    static void printArr(int arr[]) {
        System.out.print("The array is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void moveNeg(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            while(arr[left]<0)
                left++;
            while(arr[right]>0)
                right--;
            if(left>=right)
                break;
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        System.out.println("After moving....");
        printArr(arr);
    }
}
