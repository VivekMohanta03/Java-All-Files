import java.util.Scanner;

public class B13_ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int l = sc.nextInt();
        int arr[] = new int[l];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element : ");
            arr[i] = sc.nextInt();
        }
        reverseArr(arr);
        printArr(arr);
        sc.close();
    }
    static void reverseArr(int arr[]){
        int start = 0;
        int end = arr.length-1;
        int temp;
        while(start<end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }
    static void printArr(int arr[]){
        System.out.print("The array is: ");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
