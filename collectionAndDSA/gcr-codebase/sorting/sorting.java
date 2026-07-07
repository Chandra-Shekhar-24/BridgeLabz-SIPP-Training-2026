public class sorting {
    public static void printArr(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void selectionSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int minidx = i;
            for (int j = i+1; j < n; j++) {
                if(arr[j]<arr[minidx]){
                    minidx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minidx];
            arr[minidx] = temp;
        }
    }
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for (int j = i+1; j <n ; j++) {
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int j = i-1;
            int temp = arr[i];
            while (j>=0 && arr[j]>temp) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {14,98,58,23,87,10,5};
        printArr(arr);
        selectionSort(arr);
        printArr(arr);
        bubbleSort(arr);
        printArr(arr);
        insertionSort(arr);
        printArr(arr);

    }
}

