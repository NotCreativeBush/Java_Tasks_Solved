public class Task11_03 {
    public static void main(String[] args) {
        int n = 31457280;
        int ans = 0;
        for (int i = 16; i < 24; i++) {
            ans += ((n >> i) & 1);
        }
        System.out.println(ans);
    }
}
