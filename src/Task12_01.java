import java.util.Arrays;

public class Task12_01 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 2, 3, 5, 2, 2, 2, 10, 15, 20, 13};
        System.out.println(Arrays.toString(arr));
        int even = -1;
        int odd = -1;
        for (int i = 0; i < arr.length; i++) {
            if (odd == -1 && arr[i] % 2 == 1) {
                odd = i;
            }
            if (arr[i] % 2 == 0) {
                even = i;
            }
        }
        if (even == -1) {
            System.out.println("All numbers are odd");
        } else if (odd == -1) {
            System.out.println("All numbers are even");
        } else {
            int tmp = arr[even];
            arr[even] = arr[odd];
            arr[odd] = tmp;
            System.out.println(Arrays.toString(arr));
        }
    }
}
