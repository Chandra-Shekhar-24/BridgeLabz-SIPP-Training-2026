import java.util.*;

public class simpleInterest {

    public static int simpleinterest(int p, int r, int t) {
        int si = (p * r * t) / 100;
        return si;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        int principal = sc.nextInt();

        System.out.print("Enter Rate: ");
        int rate = sc.nextInt();

        System.out.print("Enter Time: ");
        int time = sc.nextInt();

        int SI = simpleinterest(principal, rate, time);

        System.out.println("The Simple Interest is " + SI +
                " for Principal " + principal +
                ", Rate of Interest " + rate +
                " and Time " + time);
    }
}