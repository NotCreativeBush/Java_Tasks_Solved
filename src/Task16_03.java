public class Task16_03 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4, 5}, {1, 9}, {3, 1, 8}};
        int[] ans = {0, 0};
        for (int[] x : arr) {
            for (int y : x) {
                if (y % 2 == 0) {
                    ans[0]++;
                } else {
                    ans[1]++;
                }
            }
        }
        System.out.println("Even: " + ans[0] + "; odd: " + ans[1]);
    }
}
