import java.util.*;
public class DistinctWindow {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter API Keys:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter K: ");
        int k=sc.nextInt();
        HashMap<Integer,Integer> map=new HashMap<>();
        int left=0;
        int ans=0;
        for(int right=0;right<n;right++){
            map.put(arr[right],map.getOrDefault(arr[right],0)+1);
            while(map.size()>k){
                map.put(arr[left],map.get(arr[left])-1);
                if(map.get(arr[left])==0)
                    map.remove(arr[left]);
                left++;
            }
            ans=Math.max(ans,right-left+1);
        }
        System.out.println("Longest Length = "+ans);
    }
}