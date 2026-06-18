import java.util.*;

public class NumberChecker3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        String original = String.valueOf(num);
        String reverse = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reverse += original.charAt(i);
        }

        if (original.equals(reverse))
            System.out.println("Palindrome Number");
        else
            System.out.println("Not a Palindrome Number");
    }
}