import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;

        int count = 0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        for (int i = 0; i < count; i++) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println(sum);

    }
}
