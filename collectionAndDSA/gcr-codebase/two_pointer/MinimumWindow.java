import java.util.*;
public class MinimumWindow {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String S: ");
        String s=sc.next();
        System.out.print("Enter String T: ");
        String t=sc.next();
        HashMap<Character,Integer> need=new HashMap<>();
        for(char c:t.toCharArray()){
            need.put(c,need.getOrDefault(c,0)+1);
        }
        HashMap<Character,Integer> window=new HashMap<>();
        int formed=0;
        int required=need.size();
        int left=0;
        int minLen=Integer.MAX_VALUE;
        int start=0;
        for(int right=0;right<s.length();right++){
            char c=s.charAt(right);
            window.put(c,window.getOrDefault(c,0)+1);
            if(need.containsKey(c) && need.get(c).intValue()==window.get(c).intValue())
                formed++;
            while(formed==required){
                if(right-left+1<minLen){
                    minLen=right-left+1;
                    start=left;
                }
                char ch=s.charAt(left);
                window.put(ch,window.get(ch)-1);
                if(need.containsKey(ch) && window.get(ch)<need.get(ch))
                    formed--;
                left++;
            }
        }
        if(minLen==Integer.MAX_VALUE)
            System.out.println("");
        else
            System.out.println(s.substring(start,start+minLen));
    }
}