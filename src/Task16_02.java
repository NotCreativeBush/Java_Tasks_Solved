import java.util.Arrays;

public class Task16_02 {
    public static int[] funny(int[][] arr){
        int[] ans=new int[arr.length];
        for(int i=0;i< arr.length;i++){
            ans[i]=Integer.MIN_VALUE;
            for (int j=0;j<arr[i].length;j++){
                ans[i]=Math.max(ans[i],arr[i][j]);
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[][] arr={{1,3},{3,4,5,8},{6,8},{1,9,6}};
        System.out.println(Arrays.toString(funny(arr)));
    }
}
