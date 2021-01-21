public class Task16_04 {
    public static void main(String[] args) {
        String[][] arr = {
                {"Germany", "2", "Scotland", "1"},
                {"Poland", "2", "Germany", "0"},
                {"Germany", "1", "Ireland", "1"},
                {"Poland", "2", "Scotland", "2"},
                {"Scotland", "1", "Ireland", "0"},
                {"Ireland", "1", "Poland", "1"},
                {"Ireland", "1", "Scotland", "1"},
                {"Germany", "3", "Poland", "1"},
                {"Scotland", "2", "Germany", "3"},
                {"Ireland", "1", "Germany", "0"},
                {"Scotland", "2", "Poland", "2"},
                {"Poland", "2", "Ireland", "1"}};
        int[] score = {0, 0, 0, 0};
        for (String[] x : arr) {
            for (int i = 0; i < 3; i += 2) {
                if (x[i].equalsIgnoreCase("Germany")) {
                    score[0] += Integer.parseInt(x[i + 1]);
                } else if (x[i].equalsIgnoreCase("Ireland")) {
                    score[1] += Integer.parseInt(x[i + 1]);
                } else if (x[i].equalsIgnoreCase("Poland")) {
                    score[2] += Integer.parseInt(x[i + 1]);
                } else {
                    score[3] += Integer.parseInt(x[i + 1]);
                }
            }
        }
        System.out.println("Germany: " + score[0] + "\nIreland: " + score[1] + "\nPoland: " + score[2] + "\nScotland: " + score[3]);
    }
}
