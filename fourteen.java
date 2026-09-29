public class fourteen{
    public static void main(String[] args) {
        int arr[]={2, 3, 7, 1, 8, 5, 11};
        //Output (2>3, 3>5, 7>8, 1>2, 8>11, 5>7, 11>)
        System.out.print("(");
        for(int i=0;i<arr.length;i++){
            int current=i;
            int next=0;
            for(int j=i+1;j<arr.length-1;j++){
                next=j;
                if(arr[current]<arr[next] && arr[next]<arr[next+1]){
                    next=j;
                }
            }
            System.out.print(arr[current]+">"+(next==0?" ":arr[next])+", ");
        }
        System.out.print(")");
    }
}