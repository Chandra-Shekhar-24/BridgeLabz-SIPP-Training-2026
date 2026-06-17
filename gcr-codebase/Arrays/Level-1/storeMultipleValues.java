import java.util.Scanner;

public class StoreMultipleValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] arr = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            double num = sc.nextDouble();

            if (num <= 0) {
                break;
            }

            if (index == arr.length) {
                break;
            }

            arr[index] = num;
            index++;
        }

        System.out.println("Numbers entered:");

        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
            total += arr[i];
        }

        System.out.println("\nSum = " + total);

        sc.close();
    }
}