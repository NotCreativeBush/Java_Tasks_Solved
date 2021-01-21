package Task23;

import java.util.Locale;

public class StringMisc {
    public static String norm(String name) {
        return name.substring(0, 1).toUpperCase(Locale.ROOT) + name.substring(1, name.length()).toLowerCase(Locale.ROOT);
    }

    public static String init(String name) {
        String[] arr = name.split(" ");
        String ans = "";
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || (i == 1 && arr.length == 3)) {
                ans+=arr[i].substring(0,1).toUpperCase(Locale.ROOT)+". ";
            }
            else{
                ans+=norm(arr[i]);
            }
        }
        return ans;
    }

    public static String tr(String s, String from, String to) {
        String ans="";
        for(int i=0;i<s.length();i++){
            char t=s.charAt(i);
            for(int y=0;y<from.length();y++){
                if(t==from.charAt(y)){
                    t=to.charAt(y);
                }
            }
            ans+=(t+"");
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(norm("caravaggio"));
        System.out.println(norm("VERMEER"));
        System.out.println(init("johann sebastian bach"));
        System.out.println(init("i. babeL"));
        System.out.println(init("jorge LUIS BORGES"));
        System.out.println(init("WOLFGANG a. mozart"));
        System.out.println(tr("November 2016", "abcdefghijklmnopqrstuvwyz", "ABCDEFGHIJKLMNOPQRSTUVWYZ"));
        System.out.println(tr("abcXYZ", "aZcX", "||Cx"));
    }
}
