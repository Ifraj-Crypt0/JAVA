import java.util.Scanner;

public class FactorialRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number for factorial");
        int x = sc.nextInt();
        int res = findFactorial(x);
        System.out.println(res);
    }

    public static int findFactorial(int x) {

        if (x == 0 || x == 1)
            return 1;

        int res = x * findFactorial(x - 1);
        return res;
    }
}
