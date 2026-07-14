import java.util.*;
public class MaxWindow {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter CPU Load:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter window size: ");
        int k=sc.nextInt();
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(i>=k-1){
                max=Math.max(max,sum);
                sum-=arr[i-k+1];
            }
        }
        System.out.println("Maximum Sum = "+max);
    }
}