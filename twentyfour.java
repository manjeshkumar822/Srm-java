import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.LinkedHashMap;
public class twentyfour {
    static void downUP(){
        String str="UDDDUDUU";
        int count =0,max=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='U'){
                count++;
            }else{
                count--;
            }
            max = Math.max(count, max);
        }
        System.out.println(max);
    }
    static void moveallhashestofront(){
        String str="Move#Hash#to#Front";
        int count=0;
        String str1="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!='#'){
                str1+=str.charAt(i);
            }else{
                count++;
            }
        }
        str="";
        while(count-->0){
            str+="#";
        }
        System.out.println(str+str1);
    }
    static void stringCompression(){
        String str="bbbbddddrrrrrtttttyyyyyy";
        String str1="";
        int strCount=0;
        int i=0;
        int count=0;
        while(i<str.length()){
            if(str1==""){
                str1+=str.charAt(i);
                strCount++;
            }
            if(strCount>=1 && str.charAt(i)==str1.charAt(strCount-1)){
                count++;
            }else if(strCount>=1 && str.charAt(i)!=str1.charAt(strCount-1)){
                str1+=count;
                count=0;
                str1+=str.charAt(i);
                strCount+=2;
            }
            i++;
        }
        str1+=count;
        System.out.println(str1);
    }
    static void  count(){
        String str="balloon";
        int count=0;
        count+=2;
        char prev = str.charAt(0);

        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==prev){
                count++;
            }else{
                count+=2;
            }
            prev=str.charAt(i);
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();

        int length=19;
        int[] nums={1, 2, 2, 3, 3, 3, 4, 4, 5, 5, 5, 5, 6, 6, 6, 7, 8, 9, 10};
        LinkedHashMap<Integer,Integer> hm = new LinkedHashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i], 0)+1);
        }
        int key[]=new int[11];
        int value[]=new int[11];
        int i=0;
        for(Map.Entry<Integer,Integer>  item: hm.entrySet()){
            key[i+1]=item.getKey();
            value[i+1]=item.getValue();
            i++;
        }
        
        
        int[] finarr=new int[key.length];
        int p=0;
        for(int o=0;o<value.length;o++){
         int max=0;
        int maxind=0;
        for(int j=0;j<key.length;j++){
            if(max<value[j]){
                max=value[j];
                maxind=j;
            }
           
      }
     for(int j=0;j<max;j++)
     {
        System.out.print(maxind+" ");
     }
     value[maxind]=0;
    
    }
   
  }
}