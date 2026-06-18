import java.util.*;

public class NumberChecker4 {

    public static boolean isPrime(int num) {

        if (num <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        System.out.println("Prime = " + isPrime(num));

        int square = num * num;

        int sum = 0;
        int temp = square;

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        System.out.println("Neon = " + (sum == num));

        temp = num;

        int digitSum = 0;
        int digitProduct = 1;

        while (temp > 0) {
            int digit = temp % 10;
            digitSum += digit;
            digitProduct *= digit;
            temp /= 10;
        }

        System.out.println("Spy = " + (digitSum == digitProduct));

        System.out.println(
                "Automorphic = " +
                String.valueOf(square).endsWith(String.valueOf(num)));

        System.out.println(
                "Buzz = " +
                (num % 7 == 0 || num % 10 == 7));
    }
}