import java.util.Scanner;

public class isStrongPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Password");
        String password = sc.nextLine();
        boolean result = isStrongPassword(password);
        System.out.println(result);
    }

    public static boolean isStrongPassword(String password) {
        boolean uppercase = false;
        boolean lowercase = false;
        boolean numbers = false;
        boolean length = false;
        
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (ch >= 'a' && ch <= 'z')
                lowercase = true;
            if (ch >= 'A' && ch <= 'Z') {
                uppercase = true;
            }
            if (password.length() >= 8) {
                length = true;
            }
    
            if (ch >= '0' && ch <= '9') {
                numbers = true;
            }
        }
        if (numbers && uppercase && lowercase && length && numbers ) {
            return true;
        }
        return false;
    }
}
