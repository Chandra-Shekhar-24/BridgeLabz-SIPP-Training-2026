import java.util.Scanner;
public class CompareCharArray {
    public static char[] getCharacters(String s) {
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        return arr;
    }

    public static boolean compareArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] userArray = getCharacters(s);
        char[] builtInArray = s.toCharArray();
        boolean result = compareArrays(userArray, builtInArray);
        for (char ch : userArray) {
            System.out.print(ch + " ");
        }
        for (char ch : builtInArray) {
            System.out.print(ch + " ");
        }
        System.out.println();
        System.out.println("Arrays Equal: " + result);
    }
}