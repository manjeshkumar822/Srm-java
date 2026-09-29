public class fifteen{
    public static void main(String[] args) {
        String str= "house no : 123@ cbe";
        int first=0;
        char ch[]=str.toCharArray();
        int end=str.length()-1;
        while(first<=end){
            if(Character.isLetterOrDigit(ch[first]) && Character.isLetterOrDigit(ch[end])){
                char temp=ch[first];
                ch[first]=ch[end];
                ch[end]=temp;
                first++;
                end--;
            }
            else if(!Character.isLetterOrDigit(ch[first])){
                first++;
            }
            else if(!Character.isLetterOrDigit(ch[end])){
                end--;
            }
        }
        str="";
        for(int i=0;i<ch.length;i++){
            str+=ch[i];
        }
        System.out.println(str);
    }
}