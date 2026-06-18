
import java.util.Scanner;

public class compareSubstring{

    public static boolean isEqual(String s1 , String s2){
        if(s1.length() != s2.length()){
            return false;
        }

        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i) != s2.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static String createSubstring(String s, int start, int end){
        String result = "";

        for(int i=start;i<end;i++){
            result += s.charAt(i);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();

        String SubstringUsingMethod = createSubstring(s, start, end);
        String builtInSubstring = s.substring(start,end);

        boolean result = isEqual(SubstringUsingMethod, builtInSubstring);


        System.out.println("Substring using charAt(): " + SubstringUsingMethod);
        System.out.println("Substring using substring(): " + builtInSubstring);
        System.out.println("Are both substrings equal? " + result);
    }
}