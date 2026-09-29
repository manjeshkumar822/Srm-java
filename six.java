import java.security.KeyStore.Entry;
import java.util.*;
public class six {
    public static void main(String[] args) {
        int[] nums={4,7,2,8,1,5,3};
        HashMap<Integer,Integer> hm = new LinkedHashMap<>();
        ArrayList<Integer> arrEven = new ArrayList<>();
        ArrayList<Integer> arrOdd = new ArrayList<>();
        int even=0,odd=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                even++;
                arrEven.add(nums[i]);
            }else{
                arrOdd.add(nums[i]);
                odd++;
            }
            hm.put(nums[i],nums[i]%2==0?0:1);
        }
        int eve=0;
        int j=0;
        int od=0;
        Collections.sort(arrEven);
        Collections.sort(arrOdd, Collections.reverseOrder());
        for(Map.Entry<Integer,Integer> item : hm.entrySet()){
            if(item.getValue()==0){
                nums[j]=arrEven.get(eve);
                eve++;
            }else{
                nums[j]=arrOdd.get(od);
                od++;
            }
            j++;
        }
        //print array
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
