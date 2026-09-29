import java.util.Arrays;
public class twentyfive {
    static void books(){
        int[] books={4,2,3,1};
        int total=5;
        int n=4;
        int sum=0;
        int count=0;
        Arrays.sort(books);
        for(int i=0;i<n;i++){       //1->2->3
            sum+=books[i];
            if(sum<=total){          //5->6->9
                System.out.println("sum is : "+sum);
                count++;            //->->->8  
            }
        }
        System.out.println("total no of books : "+count);
    }
    static void chocolateDistribute(){
        int n=10;
        int count=0;
        for(int i=1;i<=n;i++){
            if(i%5!=0){
                count+=i;
            }else{
                count+=4+i;
            }
        }
        System.out.println("Total number of Chocolates : "+count);
    }
    static void countsortingtime(){
        int n=5;
        String str="helco";
        char ch[] = str.toCharArray();
        int count=0;
        for(int i=0;i<n;i++){
            int curr=i;
            for(int j=i+1;j<n;j++){
                if((int)ch[curr]>(int)ch[j]){
                    curr=j;
                    count++;
                }
            }
            char temp=ch[i];
            ch[i]=ch[curr];
            ch[curr]=temp;

        }
        System.out.println(String.valueOf(ch));
        System.out.println(count);
        int diff=0;
        for(int i=0;i<n;i++){
            if(ch[i]!=str.charAt(i)){
                diff++;
            }
        }
        System.out.println("Diff : "+diff);
    }
    static void magicalLibrary(){
        int row=3;
        int col=3;
        int count=0;
        int[][] arr = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        for(int i=0;i<row;i++){
            int sum=0;
            for(int j=0;j<col;j++){
                if(arr[i][j]%2!=0){
                    sum+=arr[i][j];
                }
            }
            if(sum%2==0){
                count++;
            }
        }
        System.out.println(count);
    }
    static void buzzNumber(){
        int n=147;
        boolean check = false;
        if(n%7==0){
            check=true;
        }
        if(n%10==7){
            check=true;
        }
        System.out.println(check);
    }
    public static void main(String[] args) {
        buzzNumber();
    }
}