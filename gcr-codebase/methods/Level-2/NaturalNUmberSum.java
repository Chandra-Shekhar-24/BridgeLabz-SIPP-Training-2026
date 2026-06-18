import java.util.*;

public class NaturalNumberSum {

    public static int recursiveSum(int n) {
        if (n == 1)
            return 1;

        return n + recursiveSum(n - 1);
    }

    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a Natural Number");
            return;
        }

        int recursiveResult = recursiveSum(n);
        int formulaResult = formulaSum(n);

        System.out.println("Recursive Sum = " + recursiveResult);
        System.out.println("Formula Sum = " + formulaResult);

        if (recursiveResult == formulaResult) {
            System.out.println("Both results are correct and equal.");
        } else {
            System.out.println("Results do not match.");
        }
    }
}