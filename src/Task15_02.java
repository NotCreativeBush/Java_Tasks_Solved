import java.util.Arrays;

public class Task15_02 {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9};
        int t;
        for(int i=0;i<arr.length/2;i++){
            t=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=t;
        }
        System.out.print(Arrays.toString(arr));
    }
}
