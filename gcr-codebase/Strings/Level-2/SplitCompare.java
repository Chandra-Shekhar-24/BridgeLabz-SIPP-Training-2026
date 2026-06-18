import java.util.*;
public class SplitCompare {
    public static String[] splitWords(String text) {
        int words = 1;
        for(int i=0;i<text.length();i++) {
            if(text.charAt(i) == ' ')
                words++;
        }
        String[] arr = new String[words];
        String word = "";
        int index = 0;
        for(int i=0;i<text.length();i++) {
            if(text.charAt(i) != ' ') {
                word += text.charAt(i);
            }
            else {
                arr[index++] = word;
                word = "";
            }
        }
        arr[index] = word;
        return arr;
    }
    public static boolean compare(String[] a, String[] b) {
        if(a.length != b.length)
            return false;
        for(int i=0;i<a.length;i++) {
            if(!a[i].equals(b[i]))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] user = splitWords(text);
        String[] builtIn = text.split(" ");
        System.out.println(compare(user,builtIn));
    }
}