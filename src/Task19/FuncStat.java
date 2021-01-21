package Task19;

import java.util.Arrays;

public class FuncStat {
    public static int fiboR(int n) {
        if (n <= 1) {
            return n;
        }
        return fiboR(n - 1) + fiboR(n - 2);
    }

    public static int fiboI(int n) {
        int a = 0;
        int b = 1;
        int t;
        for (int i = 2; i <= n; i++) {
            t = a;
            a = b;
            b = t + a;
        }
        return b;
    }

    public static int factR(int n) {
        if (n == 1) {
            return n;
        }
        return factR(n - 1) * n;
    }

    public static int factI(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int gcdR(int a, int b) {
        int t;
        if (a > b) {
            t = a;
            a = b;
            b = t;
        }
        if (a <= 0 || a == b) {
            return b;
        }
        return gcdR(a, b - a);
    }

    public static int gcdI(int a, int b) {
        int t = 0;
        if (a > b) {
            t = a;
            a = b;
            b = t;
        }
        while (a != 0) {
            b -= a;
            if (a > b) {
                t = a;
                a = b;
                b = t;
            }
        }
        return b;
    }

    public static int maxElem(int[] arr, int from) {
        if (from == arr.length - 1) {
            return arr[from];
        }
        return Math.max(maxElem(arr, from + 1), arr[from]);
    }

    public static int numEven(int[] arr, int from) {
        int ans = 0;
        if (arr[from] % 2 == 0) {
            ans = 1;
        }
        if (from == arr.length - 1) {
            return ans;
        }
        return ans + numEven(arr, from + 1);
    }

    public static void reverse(int[] arr, int from) {
        if (from >= arr.length / 2) {
            return;
        }
        int tmp = arr[from];
        arr[from] = arr[arr.length - from - 1];
        arr[arr.length - from - 1] = tmp;
        reverse(arr, from + 1);
    }

    public static boolean isPalindrom(String s) {
        boolean bool = s.charAt(0) == s.charAt(s.length() - 1);
        if (s.length() <= 2) {
            return bool;
        }
        if (bool) {
            bool = isPalindrom(s.substring(1, s.length() - 1));
        }
        return bool;
    }

    public static void main(String[] args) {
        System.out.println("Wait...");
        System.out.println(FuncStat.fiboR(45));
        System.out.println(FuncStat.fiboI(45));
        System.out.println(FuncStat.factR(12));
        System.out.println(FuncStat.factI(12));
        System.out.println(FuncStat.gcdR(12125, 40643));
        System.out.println(FuncStat.gcdI(12125, 40643));
        int[] a = {3, 8, 2, 9, 7, 4};
        System.out.println("Max     : " + FuncStat.maxElem(a, 0));
        System.out.println("Num even: " + FuncStat.numEven(a, 0));
        System.out.println("Before:   " + Arrays.toString(a));
        FuncStat.reverse(a, 0);
        System.out.println("After :   " + Arrays.toString(a));
        System.out.println("Is'radar'a palindrom? " + FuncStat.isPalindrom("radar"));
        System.out.println("Is'abba'a palindrom?  " + FuncStat.isPalindrom("abba"));
        System.out.println("Is'rover'a palindrom? " + FuncStat.isPalindrom("rover"));
    }
}
