package Task24;

public class DNA {
    public static int simil(String a, String b) {
        if(a.length()!=b.length()){
            if(a.length()>b.length()){
                String t=a;
                a=b;
                b=t;
            }
            int ans=0;
            for(int i=0;i<b.length()-a.length()+1;i++){
                int tmp=simil(a,b.substring(i,i+a.length()));
                if(tmp>ans){
                    ans=tmp;
                }
            }
            return ans;
        }
        int ans=0;
        int count=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)==b.charAt(i)){
                count++;
            }else{
                ans+=count*count;
                count=0;
            }
        }
        ans+=count*count;
        return ans;
    }

    public static void main(String[] args) {
        String a = "AACTACGTC";
        String b = "ACGTA";
        System.out.println(a + " and " + b + " -> " + simil(a, b));
        String c = "GCGC";
        String d = "AGGGCA";
        System.out.println(c + " and " + d + " -> " + simil(c, d));
    }
}
