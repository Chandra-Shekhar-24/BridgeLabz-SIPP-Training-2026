import java.util.*;

public class NumberChecker2 {

    public static int[] storeDigits(int num) {

        String str = String.valueOf(num);

        int[] digits = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            digits[i] = str.charAt(i) - '0';
        }

        return digits;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        int[] digits = storeDigits(num);

        int sum = 0;
        double sumSquares = 0;

        for (int digit : digits) {
            sum += digit;
            sumSquares += Math.pow(digit, 2);
        }

        System.out.println("Sum of Digits = " + sum);
        System.out.println("Sum of Squares = " + sumSquares);

        if (num % sum == 0)
            System.out.println("Harshad Number");
        else
            System.out.println("Not a Harshad Number");

        int[][] frequency = new int[10][2];

        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
        }

        for (int digit : digits) {
            frequency[digit][1]++;
        }

        System.out.println("Digit Frequency:");

        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) {
                System.out.println(i + " -> " + frequency[i][1]);
            }
        }
    }
}