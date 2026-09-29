import java.util.Scanner;
public class ten {
    static void printArr(String[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int choose(){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        if(n>0 && n<10){
            return n;
        }
        return -1;
    }
    public static void main(String[] args) {
        String[][] box = new String[3][3];
        for(int i=0;i<box.length;i++){
            for(int j=0;j<box[0].length;j++){
                box[i][j]="-";
            }
        }
        int count=0;
        while(true){
            
            printArr(box);
            //x
            int x=choose();
            System.out.println(x);
        }
    }
}
