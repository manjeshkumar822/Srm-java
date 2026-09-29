public class five{
    public static void main(String[] args) {
        String target ="TUS";
        boolean result=false;
        String matt[][] = {
            {"W","E","L","C","O"},
            {"M","E","T","O","Z"},
            {"O","O","U","N","I"},
            {"V","E","S","I","T"}
        };
        for(int i=0;i<matt.length;i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<matt[0].length;j++){
                sb.append(matt[i]);
            }
            String str = sb.toString();
            if(str.toLowerCase().contains(target.toLowerCase())){
                result = true;
            }
            
        }
        for(int o=0;o<matt[0].length;o++){
            String str="";
            for(int p=0;p<matt.length;p++){
                str+=matt[p][o];
            }
            if(str.toLowerCase().contains(target.toLowerCase())){
                result=true;
            }
        }
        System.out.println(result);
    }
}