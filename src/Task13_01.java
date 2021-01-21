import java.util.Arrays;

public class Task13_01 {
    public static void main(String[] args) {
        final int SIZE = 10;
        final int NUMS = 13;
        int[] arr = new int[SIZE];
        int counter = 0;
        boolean repeat = false;
        for (int i = 0; i < SIZE; i++) {
            do {
                counter++;
                repeat = false;
                arr[i] = (int) (Math.random() * (NUMS) + 1);
                for (int j = 0; j < i; j++) {
                    if (arr[i] == arr[j]) {
                        repeat = true;
                        break;
                    }
                }
            } while (repeat);
        }

        System.out.println("With SIZE=" + SIZE + " and Nums=" + NUMS + " the array\nhas been filled after " + counter + " trials.");
        System.out.println("Array: " + Arrays.toString(arr));
    }
}
