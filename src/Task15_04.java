public class Task15_04 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 2, 3, 45, 5}, {4, 5, 6, 213, 213}, {7, 8, 9, 1241, 123123, 43434}};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][arr[i].length - 1];
        }
        System.out.println(sum);
    }
}
