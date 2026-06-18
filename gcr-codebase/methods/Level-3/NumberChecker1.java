import java.util.*;

public class NumberChecker1 {

    public static int[] storeDigits(int num) {

        String str = String.valueOf(num);

        int[] digits = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            digits[i] = str.charAt(i) - '0';
        }

        return digits;
    }

    public static boolean isDuck(int[] digits) {

        for (int digit : digits) {
            if (digit == 0) {
                return true;
            }
        }

        return false;
    }

    public static boolean isArmstrong(int num, int[] digits) {

        int sum = 0;

        for (int digit : digits) {
            sum += Math.pow(digit, digits.length);
        }

        return sum == num;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        int[] digits = storeDigits(num);

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int digit : digits) {

            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }

            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }

        System.out.println("Duck Number = " + isDuck(digits));
        System.out.println("Armstrong Number = " + isArmstrong(num, digits));
        System.out.println("Largest Digit = " + largest);
        System.out.println("Second Largest Digit = " + secondLargest);
        System.out.println("Smallest Digit = " + smallest);
        System.out.println("Second Smallest Digit = " + secondSmallest);
    }
}