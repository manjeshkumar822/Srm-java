// import java.util.*;
import java.util.HashSet;

public class twelth {
    public static void main(String[] args) {
        int arr[]={1,2,3,6,9};
        int arr1[]={2,4,5,10};
        //merge array without dublicates
        HashSet<Integer> hs =new  HashSet<>();

        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        for(int j=0;j<arr1.length;j++){
            hs.add(arr1[j]);
        }
        System.out.println(hs);
    }
}