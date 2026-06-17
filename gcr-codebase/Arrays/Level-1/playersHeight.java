import java.util.Scanner;
public class playersHeight{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] heights = new double[11];
        double sumofHeight = 0;

        for(int i=0;i<heights.length;i++){
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
        }

        for (int i = 0; i < heights.length; i++) {
            sumofHeight += heights[i];
        }

        double mean_height = sumofHeight/11;

         System.out.println("Mean height of football team = " + mean_height);
    }
}