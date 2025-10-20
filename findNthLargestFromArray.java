import java.util.Arrays;
import java.util.Scanner;

public class findNthLargestFromArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 18, 45, 9, 73, 56, 2, 88, 31, 60, 14 };

        // int newArr[] = new int[arr.length];
        // System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println("Enter Nth largest term index");
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println("The " + n + "st" + " Largest Value is: " + arr[n - 1]);

        } else if (n == 2) {
            System.out.println("The " + n + "nd" + " Largest Value is: " + arr[n - 1]);
        } else {
            System.out.println("The " + n + "th" + " Largest Value is: " + arr[n - 1]);
        }
    }
}