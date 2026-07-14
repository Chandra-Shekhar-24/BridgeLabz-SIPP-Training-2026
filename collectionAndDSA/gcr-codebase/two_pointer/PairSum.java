import java.util.*;
public class PairSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter sorted transactions:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        int left = 0;
        int right = n - 1;
        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum == target){
                System.out.println("Pair Found: " + arr[left] + " " + arr[right]);
                return;
            }
            else if(sum < target){
                left++;
            }
            else{
                right--;
            }
        }
        System.out.println("Pair Not Found");
    }
}