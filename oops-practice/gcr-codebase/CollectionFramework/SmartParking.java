import java.util.*;
public class SmartParking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> vehicles = new ArrayList<>();
        while (true) {
            System.out.println("\n1.Vehicle Entry");
            System.out.println("2.Vehicle Exit");
            System.out.println("3.Search Vehicle");
            System.out.println("4.Display Vehicles");
            System.out.println("5.Exit");
            System.out.print("Enter Choice: ");
            int ch = sc.nextInt();
            sc.nextLine();
            switch (ch) {
                case 1:
                    System.out.print("Enter Vehicle Number: ");
                    String num = sc.nextLine();
                    vehicles.add(num);
                    System.out.println("Vehicle Parked.");
                    break;
                case 2:
                    System.out.print("Enter Vehicle Number: ");
                    num = sc.nextLine();
                    if (vehicles.remove(num))
                        System.out.println("Vehicle Removed.");
                    else
                        System.out.println("Vehicle Not Found.");
                    break;
                case 3:
                    System.out.print("Enter Vehicle Number: ");
                    num = sc.nextLine();
                    if (vehicles.contains(num))
                        System.out.println("Vehicle is Parked.");
                    else
                        System.out.println("Vehicle Not Found.");
                    break;
                case 4:
                    System.out.println("\nParked Vehicles:");
                    for (String v : vehicles)
                        System.out.println(v);
                    System.out.println("Total Occupied Slots: " + vehicles.size());
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}