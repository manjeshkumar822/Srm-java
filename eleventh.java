public class eleventh {
    static void printarr(int[] arr){
        for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};//output 7,1,6,2,5,3,4
        selectionsort(arr);
        printarr(arr);
    }
    public static void selectionsort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int ind=0;
            if(i%2!=0){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    ind=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[ind];
            arr[ind]=temp;
            }
            if(i%2==0){
                for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    ind=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[ind];
            arr[ind]=temp;
            }
        }

    }
}
