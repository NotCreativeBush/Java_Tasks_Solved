package Task19;

import java.util.Arrays;

public class Task19_02 {
    static boolean isLess(String a, String b) {
        if (a.compareTo(b) < 0 || a.length() < b.length()) {
            return true;
        }
        return false;
    }

    static void sortSel(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (isLess(arr[j], arr[index])) {
                    index = j;
                }
            }
            String tmp = arr[index];
            arr[index] = arr[i];
            arr[i] = tmp;
        }
    }

    public static void main(String[] args) {
        String[] arr = {"Kate", "Bea", "Mary", "Bea", "Zoe"};
        System.out.println(Arrays.toString(arr));
        sortSel(arr);
        System.out.println(Arrays.toString(arr));
    }
}
