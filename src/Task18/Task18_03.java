package Task18;

import java.util.Arrays;

public class Task18_03 {
    public static void main(String[] args) {
        int[][][] opers = {{{100, -50, 25}, {150, -300}, {300, -90, 100}}, {{90, -60, 250}, {300, 20, -100}}, {{20, 50}, {300}, {20, -20, 40}, {100, -200}}};
        int[] ans = new int[opers.length];
        for (int i = 0; i < opers.length; i++) {
            ans[i] = 0;
            for (int[] x : opers[i]) {
                for (int y : x) {
                    ans[i] += y;
                }
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
