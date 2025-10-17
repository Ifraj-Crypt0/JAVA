import java.util.Scanner;

// not built to handle edge cases like {1,2,1,2}
// works only if there is an element with max count
public class majorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Length");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Element");
            arr[i] = sc.nextInt();
        }
        majorityElement(arr);
    }

    public static void majorityElement(int[] arr) {

        int maxEle = arr[0];
        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            int currCount = 0;
            int curr = arr[i];
            for (int j = 0; j < arr.length; j++) {
                int compareTo = arr[j];
                if (curr == compareTo) {
                    currCount++;
                }

                if (currCount > maxCount) {
                    maxCount = currCount;
                    maxEle = arr[i];
                }

            }
        }
        System.out.println(maxEle);
    }

}
