import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Physics Marks: ");
        double physics = sc.nextDouble();

        System.out.print("Enter Chemistry Marks: ");
        double chemistry = sc.nextDouble();

        System.out.print("Enter Maths Marks: ");
        double maths = sc.nextDouble();

        double total = physics + chemistry + maths;
        double percentage = total / 3;

        System.out.println("Percentage = " + percentage + "%");

        if (percentage >= 80) {
            System.out.println("Grade A");
        } else if (percentage >= 70) {
            System.out.println("Grade B");
        } else if (percentage >= 60) {
            System.out.println("Grade C");
        } else if (percentage >= 50) {
            System.out.println("Grade D");
        } else if (percentage >= 40) {
            System.out.println("Grade E");
        } else {
            System.out.println("Grade R");
        }

        sc.close();
    }
}