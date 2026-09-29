import java.util.Arrays;

public class seven{
    public static void main(String[] args) {
        int[] data = {4,7,2,8,1,5,3};
        System.out.println(Arrays.toString(data));
        selectionSort(data);
        System.out.println(Arrays.toString(data));
    }
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if(arr[i]%2==0 && arr[j]%2==0){
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }if(arr[i]%2!=0 && arr[j]%2!=0){
                if (arr[j] > arr[minIdx]) {
                    minIdx = j;
                }
            }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
}