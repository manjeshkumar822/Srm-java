public class twentythree{
public static void main(String[] args) {
    int num=629;
    int n=num%100;
    String str = numToWord(num/100);
    n%=10;
    String str1 = num%100>10 && num%100<20 ?numToWordl(num%100):numToWords(num%100/10);
    String str2 = numToWordl(n)=="nu"?numToWord(n):numToWordl(num%100);
    
    System.out.println(str+" Hundred "+str1+" "+str2);
}
static String numToWord(int n){
    switch (n) {
        case 1:
            return "one";
        case 2:
            return "two";
        case 3:
            return "three";
        case 4:
            return "four";
        case 5:
            return "five";
        case 6:
            return "six";
        case 7:
            return "seven";
        case 8:
            return "eight";
        case 9:
            return "nine";
        default:
            return "nu";
    }
}
static String numToWordl(int n){
    switch (n) {
        case 11:
            return "eleven";
        case 12:
            return "twelve";
        case 13:
            return "thirteen";
        case 14:
            return "fourteen";
        case 15:
            return "fifteen";
        case 16:
            return "sixteen";
        case 17:
            return "seventeen";
        case 18:
            return "eighteen";
        case 19:
            return "nineteen";
        default:
            return "nu";
    }
}

static String numToWords(int n){
    switch (n) {
        case 2:
            return "twenty";
        case 3:
            return "thirty";
        case 4:
            return "fourty";
        case 5:
            return "fifty";
        case 6:
            return "sixty";
        case 7:
            return "seventy";
        case 8:
            return "eighty";
        case 9:
            return "ninety";
        default:
            return "nu";
    }
}
}