import java.util.Arrays;
import java.util.Scanner;

public class moveZeroes {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Array Length");
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // for (int i = 0; i < n; i++) {
        // System.out.println("Enter Element");
        // arr[i] = sc.nextInt();
        // }
        int arr[] = { 1, 2, 3, 0, 6, 0, 5 };
        moveZeroes(arr);

    }

    public static void moveZeroes(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            // {1,2,3,0,6,0,5};
            // {1,0,1}
            int lastEle = arr.length;
            if (curr == 0) {
                lastEle -= 1;
                arr[lastEle] = curr;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
