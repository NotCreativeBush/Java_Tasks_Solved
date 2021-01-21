public class Task13_02 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 2, 6};
        int arrMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arrMax) {
                arrMax = arr[i];
            }
        }
        for (int i = 0; i < arrMax; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(((i < arrMax - arr[j]) ? " " : "*") + (j == arr.length - 1 ? "\n" : " "));
            }
        }
    }
}
