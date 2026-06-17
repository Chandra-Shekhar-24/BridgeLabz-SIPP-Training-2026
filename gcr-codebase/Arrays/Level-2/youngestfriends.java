import java.util.Scanner;
public class youngestfriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] age = new int[3];
        int[] height = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of friend " + (i + 1) + ": ");
            age[i] = sc.nextInt();
            System.out.print("Enter height of friend " + (i + 1) + ": ");
            height[i] = sc.nextInt();
        }
        int maxAge = Integer.MIN_VALUE;
        for (int i = 0; i < age.length; i++) {
            if (age[i] > maxAge) {
                maxAge = age[i];
            }
        }
        int maxHeight = Integer.MIN_VALUE;
        for (int i = 0; i < height.length; i++) {
            if (height[i] > maxHeight) {
                maxHeight = height[i];
            }
        }
        System.out.println("Max Age is " + maxAge + " and Max Height is" + maxHeight);
    }
}