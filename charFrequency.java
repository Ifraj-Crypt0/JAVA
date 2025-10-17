import java.util.Arrays;
import java.util.Scanner;

public class charFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Line");
        String str = sc.nextLine();
        str = str.toUpperCase();

        char[] alphabets = new char[26];
        int asci = (char) 'A';

        for (int i = 0; i < 26; i++) {
            alphabets[i] = (char) (asci + i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                if (alphabets[i] == ch) {
                    count++;
                }
            }
            if (count != 0)
                System.out.print(count + "" + alphabets[i] + " ");
        }

    }
}
