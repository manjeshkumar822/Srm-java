import java.util.ArrayList;
import java.util.Collections;
public class thirteen{
    static String reverse(String str){
        // String str2="";
        return new StringBuilder(str).reverse().toString();

    }
    public static void main(String[] args) {
    //             1
    //          3  2
    //       6  5  4
    //   10  9  8  7
        int n=7;
        int i=0;
        int num=1;
        while(i<n){
            for(int j=1;j<n-i;j++){
                System.out.print(" ");
            }
            ArrayList<Integer> arr= new ArrayList<>();
            for(int l=1;l<i;l++){
                    arr.add(num);
                num++;
            }
            Collections.reverse(arr);
            for(int nn : arr){
                System.out.print(nn+"");
            }
            System.out.println();
            i++;
        }
    }
}