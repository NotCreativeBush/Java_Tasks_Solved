public class Task17_04 {
    public static void main(String[] args) {
        final int N = 90;
        final int NUM_OF_SIMULATIONS = 100000;
        int totalboxes = 0;
        for (int i = 0; i < NUM_OF_SIMULATIONS; i++) {
            totalboxes += boxesBought(N);
        }
        double aver = totalboxes / (double) NUM_OF_SIMULATIONS;
        System.out.println("***** N = " + N);
        System.out.println("Average : " + aver);
        System.out.println("Expected: " + N * harmo(N));
    }

    static int boxesBought(int coupons) {
        int ans = 0;
        while (coupons > 0) {
            ans++;
            coupons -= Math.round(Math.random());
        }
        return ans;
    }

    static double harmo(int n) {
        double ans = 0;
        for (double i = 1; i <= n; i++) {
            ans += 1 / i;
        }
        return ans;
    }
}
