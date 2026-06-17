import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int multiplication[] = new int[4];

        for (int i = 6; i <= 9; i++) {
            multiplication[i - 6] = num * i;
        }
        for (int i = 6; i <= 9; i++) {
            System.out.println(num + " * " + i + " = " + multiplication[i - 6]);
        }
    }
}