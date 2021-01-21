import java.util.Arrays;

public class Task17_02 {
    static int[] notFunny(int[] arr) {
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        int t = arr[minIndex];
        arr[minIndex] = arr[maxIndex];
        arr[maxIndex] = t;
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {112, 12, 463, 7, 2, 1213, 653};
        System.out.println(Arrays.toString(arr));
        arr = notFunny(arr);
        System.out.println(Arrays.toString(arr));
    }
}
