public class Task0601 {
    public static void main(String[] args) {
        int fromy = 2000, fromm = 2, fromd = 3;
        int toy = 2127, tom = 11, tod = 29;

        System.out.println("**** Original\n" +
                "From " + fromy + "/" +
                fromm + "/" + fromd + " to " +
                toy + "/" + tom + "/" + tod);

        int period = 0;
        period = ((fromy - 2000) << 25) + (fromm << 21) + (fromd << 16) + ((toy - 2000) << 9) + (tom << 5) + tod;
        // ... (pack 6 numbers into 'period')

        fromy = fromm = fromd = toy = tom = tod = 0;
        tod = period & 0b11111;
        tom = (period >> 5) & 0b1111;
        toy = ((period >> 9) & 0b1111111) + 2000;
        fromd = (period >> 16) & 0b11111;
        fromm = (period >> 21) & 0b1111;
        fromy = ((period >> 25) & 0b1111111) + 2000;
        // ... (unpack 6 numbers from 'period')

        System.out.println("**** Reconstructed\n" +
                "From " + fromy + "/" +
                fromm + "/" + fromd + " to " +
                toy + "/" + tom + "/" + tod);
    }
}
