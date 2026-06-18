import java.util.*;
public class ShortestLongest {
    public static String[] splitWords(String text){
        int words = 1;
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)==' ')
                words++;
        }
        String[] arr = new String[words];
        String word="";
        int k=0;
        for(int i=0;i<text.length();i++){
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
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] words = splitWords(text);
        String shortest = words[0];
        String longest = words[0];
        for(int i=1;i<words.length;i++){
            if(words[i].length() < shortest.length())
                shortest = words[i];
            if(words[i].length() > longest.length())
                longest = words[i];
        }
        System.out.println("Shortest Word = " + shortest);
        System.out.println("Longest Word = " + longest);
    }
}