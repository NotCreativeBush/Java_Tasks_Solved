public class Task15_03 {
    public static void main(String[] args) {
        int[] xarr = new int[25];
        int[] yarr = new int[25];
        for (int i = 0; i < xarr.length; i++) {
            xarr[i] = (int) (Math.random() * 125);
            yarr[i] = (int) (Math.random() * 125);
        }
        int xMin = Integer.MAX_VALUE;
        int xMax = Integer.MIN_VALUE;
        int yMin = Integer.MAX_VALUE;
        int yMax = Integer.MIN_VALUE;
        for (int i = 0; i < xarr.length; i++) {
            xMin = Math.min(xMin, xarr[i]);
            xMax = Math.max(xMax, xarr[i]);
            yMin = Math.min(yMin, yarr[i]);
            yMax = Math.max(yMax, yarr[i]);
        }
        System.out.println(xMin + " " + yMin + "\n" + xMax + " " + yMax);
    }
}
