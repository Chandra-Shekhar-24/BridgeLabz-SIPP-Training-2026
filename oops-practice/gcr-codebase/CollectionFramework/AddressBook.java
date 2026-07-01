import java.util.*;

class Contact {
    String name;
    String phone;
    String email;

    Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
}

public class AddressBook {
    static ArrayList<Contact> list = new ArrayList<>();
    static HashMap<String, Contact> map = new HashMap<>();
    static HashSet<String> phoneSet = new HashSet<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1.Add Contact");
            System.out.println("2.Search Contact");
            System.out.println("3.Delete Contact");
            System.out.println("4.Display Contacts");
            System.out.println("5.Exit");
            System.out.print("Enter Choice: ");
            int ch = sc.nextInt();
            sc.nextLine();
            switch (ch) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Phone: ");
                    String phone = sc.nextLine();
                    if (phoneSet.contains(phone)) {
                        System.out.println("Phone Number Already Exists!");
                        break;
                    }
                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();
                    Contact c = new Contact(name, phone, email);
                    list.add(c);
                    map.put(name, c);
                    phoneSet.add(phone);
                    System.out.println("Contact Added.");
                    break;
                case 2:
                    System.out.print("Enter Name: ");
                    name = sc.nextLine();
                    if (map.containsKey(name)) {
                        Contact temp = map.get(name);
                        System.out.println(temp.name + " " + temp.phone + " " + temp.email);
                    } else {
                        System.out.println("Not Found");
                    }
                    break;
                case 3:
                    System.out.print("Enter Name: ");
                    name = sc.nextLine();
                    if (map.containsKey(name)) {
                        Contact temp = map.get(name);
                        list.remove(temp);
                        phoneSet.remove(temp.phone);
                        map.remove(name);
                        System.out.println("Deleted");
                    } else {
                        System.out.println("Not Found");
                    }
                    break;
                case 4:
                    Collections.sort(list, (a, b) -> a.name.compareTo(b.name));
                    for (Contact x : list) {
                        System.out.println(x.name + " " + x.phone + " " + x.email);
                    }
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}