import java.util.Scanner;
public class UniqueCharacters {
    public static char[] uniqueCharacters(String text) {
        char[] temp = new char[text.length()];
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            boolean unique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                temp[count++] = text.charAt(i);
            }
        }
        char[] result = new char[count];
        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        char[] unique = uniqueCharacters(text);
        System.out.print("Unique Characters: ");
        for (char ch : unique) {
            System.out.print(ch + " ");
        }
    }
}