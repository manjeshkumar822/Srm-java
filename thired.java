public class thired {
    public static void main(String[] args) {
        String wo = "PROGRAM";
        String[][] box = new String[wo.length()][wo.length()];
        for(int i=0;i<box.length;i++){
            for(int j=box.length-1;j>=0;j--){
                if(box[i][j]==null){
                    box[i][j]=" ";
                }
                if(i==j){
                    box[i][j]=String.valueOf(wo.charAt(j));
                }
                    box[box.length-1-j][j]=String.valueOf(wo.charAt(j));
                
            }
        }
        printarr(box);

    }
    public static void printarr(String[][] str){
        for(int i=0;i<str.length;i++){
            for(int j=0;j<str.length;j++){
                System.out.print(str[i][j]+" ");
            }System.out.println();
        }
    }
}
