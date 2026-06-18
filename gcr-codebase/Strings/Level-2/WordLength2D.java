import java.util.*;
public class WordLength2D {
    public static String[] splitWords(String text) {
        int words = 1;
        for(int i=0;i<text.length();i++) {
            if(text.charAt(i)==' ')
                words++;
        }
        String[] arr = new String[words];
        String word="";
        int k=0;
        for(int i=0;i<text.length();i++) {
            if(text.charAt(i)!=' ')
                word += text.charAt(i);
            else{
                arr[k++] = word;
                word="";
            }
        }
        arr[k]=word;
        return arr;
    }
    public static String[][] wordLength(String[] words){
        String[][] result = new String[words.length][2];
        for(int i=0;i<words.length;i++){
            result[i][0] = words[i];
            result[i][1] = String.valueOf(words[i].length());
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] words = splitWords(text);
        String[][] result = wordLength(words);
        System.out.println("Word\tLength");
        for(int i=0;i<result.length;i++){
            System.out.println(
                    result[i][0] + "\t" +
                    Integer.parseInt(result[i][1]));
        }
    }
}