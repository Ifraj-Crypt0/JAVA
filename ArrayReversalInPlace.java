import java.util.Arrays;
import java.util.Scanner;

public class ArrayReversalInPlace {
    public static void main(String[] args) {
        reverseArray();
    }

    public static void reverseArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Length");
        int len = sc.nextInt();
        int arr[] = new int[len];

        for (int i = 0; i < len; i++) {
        System.out.print("Enter element: ");
        arr[i] = sc.nextInt();
        }

        

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            int start = arr[i];
            int finalValue = arr[arr.length - i - 1];

            arr[i] = finalValue;
            arr[arr.length - i - 1] = temp;

        }
        System.out.println(Arrays.toString(arr));
    }
}
