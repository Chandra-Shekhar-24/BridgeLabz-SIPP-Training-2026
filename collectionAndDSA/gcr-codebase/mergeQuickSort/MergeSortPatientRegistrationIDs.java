import java.util.*;
public class MergeSortPatientRegistrationIDs {
        static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j])
                temp[k++] = arr[i++];
            else
                temp[k++] = arr[j++];
        }
        while (i <= mid)
            temp[k++] = arr[i++];
        while (j <= high)
            temp[k++] = arr[j++];
        for (i = low, k = 0; i <= high; i++, k++)
            arr[i] = temp[k];
    }
    static void mergeSort(int[] arr, int low, int high) {
        if (low >= high)
            return;
        int mid = low + (high - low) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ids = new int[n];
        for (int i = 0; i < n; i++)
            ids[i] = sc.nextInt();
        mergeSort(ids, 0, n - 1);
        for (int id : ids)
            System.out.print(id + " ");
    }
}