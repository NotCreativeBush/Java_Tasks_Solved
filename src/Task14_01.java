import java.lang.reflect.AccessibleObject;

public class Task14_01 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 3, 2, 0, 0, 1, 5};
        int decr = 0;
        int incr = 0;
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                decr++;
            } else {
                decr = 0;
            }
            if (arr[i] > arr[i - 1]) {
                incr++;
            } else {
                incr = 0;
            }
            if (incr >= 2 || decr >= 2) {
                count++;
            }

        }
        System.out.println(count);
    }
}
