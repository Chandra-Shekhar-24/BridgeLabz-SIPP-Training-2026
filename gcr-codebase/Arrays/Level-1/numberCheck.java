import java.util.Scanner;

public class numberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                if (arr[i] % 2 == 0) {
                    System.out.println("positive and even");
                } else {
                    System.out.println("positive and odd");
                }
            } else if (arr[i] < 0) {
                System.out.println("negative");
            } else {
                System.out.println("zero");
            }
        }

        if (arr[0] == arr[arr.length - 1]) {
            System.out.println("equal");
        } else if (arr[0] > arr[arr.length - 1]) {
            System.out.println("greater");
        } else {
            System.out.println("less");
        }
    }
}