import java.util.Arrays;

public class Task12_02_Alternate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int tmp = arr[0];
        int t;
        for (int i = arr.length - 1; i >= 0; i--) {
            t = arr[i];
            arr[i] = tmp;
            tmp = t;
        }
        System.out.println(Arrays.toString(arr));
    }
}
