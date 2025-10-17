import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome To IFRAJ BANK ©");

        System.out.print("Create A PIN: ");
        int setPIN = sc.nextInt();

        System.out.println("Congratulations Your Account Has Been Created");
        int attempts = 3;
        double balance = 0;

        if (attempts > 0) {
            while (attempts > 0) {
                System.out.print("Enter your pin: ");
                int pin = sc.nextInt();
                if (pin == setPIN) {

                    while (true) {
                        System.out.print("==== ATM Menu ====\n" + //
                                "1. Check Balance\n" + //
                                "2. Deposit Money\n" + //
                                "3. Withdraw Money\n" + //
                                "4. Exit\n" + //
                                "Choose an option: ");
                        int input = sc.nextInt();
                        if (input == 1) {
                            System.out.println("Your Balance is " + balance + "$");
                        } else if (input == 2) {
                            System.out.print("Deposit Money: ");
                            double deposit = sc.nextDouble();
                            balance = balance + deposit;
                            System.out.println("New Balance is " + balance + "$");
                        } else if (input == 3) {
                            System.out.print("Withdraw: ");
                            double withdrawal = sc.nextDouble();
                            if (withdrawal <= balance) {
                                System.out.println("Available balance is " + balance + "$");
                                balance = balance - withdrawal;
                                System.out.println("New balance is " + balance + "$");
                            } else {
                                System.out.println("Insufficient Balance");
                            }
                        } else if (input == 4) {
                            break;
                        } else {
                            System.out.println("Please input in a number between 1-4");
                        }
                    }
                } else {
                    attempts--;
                    System.out.println("You have " + attempts + " attempts remaining");
                }
            }
        }

    }

}
