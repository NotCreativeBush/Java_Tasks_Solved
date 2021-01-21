public class Task12_04 {
    public static void main(String[] args) {
        int[] arr = {4, 3, 1, -2, 4, -2, 2, 4, 3};
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        int minIndex = -1;
        int maxIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
                minIndex = i;
            }
            if (arr[i] >= maxValue) {
                maxValue = arr[i];
                maxIndex = i;
            }
            System.out.print(arr[i] + (i == arr.length - 1 ? "\n" : ", "));
        }
        arr[minIndex] = maxValue;
        arr[maxIndex] = minValue;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i == arr.length - 1 ? "\n" : ", "));
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + (i == 0 ? "\n" : ", "));
        }
    }
}
