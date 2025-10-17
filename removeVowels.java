import java.util.Scanner;

public class removeVowels {

    public static String removeVowels(String str) {
        char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            boolean vowel = false;
            char ch = str.charAt(i);
            for (int j = 0; j < vowels.length; j++) {
                if (ch == vowels[j]) {
                    vowel = true;
                    break;
                }
            }
            if (!vowel) {
                res += ch;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        // Abcdefghi
        String res = removeVowels(str);
        System.out.println("String without vowels " + res);
    }
}