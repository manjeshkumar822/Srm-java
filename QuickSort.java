public class QuickSort {

    public static void main(String[] args) {
        int[] data = {8, 7, 2, 1, 0, 9, 6};
        
        System.out.println("Unsorted Array:");
        printArray(data);
        
        quickSort(data, 0, data.length - 1);
        
        System.out.println("\nSorted Array:");
        printArray(data);
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  
        int i = (low - 1); 

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    private static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
