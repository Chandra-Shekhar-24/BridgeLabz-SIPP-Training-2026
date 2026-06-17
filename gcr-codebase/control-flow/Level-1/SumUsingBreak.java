import java.util.Scanner;

public class SumUsingBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sum = 0;

        while (true) {
            System.out.print("Enter a number: ");
            double num = sc.nextDouble();

            if (num <= 0) {
                break;
            }

            sum += num;
        }

        System.out.println("Sum = " + sum);
        sc.close();
    }
}