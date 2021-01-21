public class Task12_03 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 3, 2, 6, 3, 6, 8, 2, 9};
        boolean bool;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            bool = true;
            for (int j = 0; j < i; j++) {
                if (arr[j] == arr[i]) {
                    bool = false;
                    break;
                }
            }
            if (bool) {
                count++;
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println("\nThere were " + count + " different numbers");
    }
}
