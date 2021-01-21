package Task24;

public class Problem1 {
    public static String halfSwap(String str){
        return str.substring(str.length()/2,str.length())+str.substring(0,str.length()/2);
    }

    public static void main(String[] args) {
        System.out.println(halfSwap("abcde"));
    }
}
