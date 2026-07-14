import java.util.*;
public class ThreeSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter target: ");
        int target=sc.nextInt();
        Arrays.sort(arr);
        for(int i=0;i<n-2;i++){
            if(i>0 && arr[i]==arr[i-1])
                continue;
            int left=i+1;
            int right=n-1;
            while(left<right){
                int sum=arr[i]+arr[left]+arr[right];
                if(sum==target){
                    System.out.println(arr[i]+" "+arr[left]+" "+arr[right]);
                    while(left<right && arr[left]==arr[left+1])
                        left++;
                    while(left<right && arr[right]==arr[right-1])
                        right--;
                    left++;
                    right--;
                }
                else if(sum<target)
                    left++;
                else
                    right--;
            }
        }
    }
}