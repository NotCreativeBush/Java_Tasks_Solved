package Task24;

public class Problem2 {
    public static void passValidate(char[] arr) {
        System.out.print("Checking ");
        System.out.println(arr);
        boolean ok = true;
        if (!checkLength(arr)) {
            System.out.println("Too short");
            ok = false;
        }
        if (!checkDifferentChars(arr)) {
            System.out.println("Too few different characters");
            ok = false;
        }
        if (!checkDigit(arr)) {
            System.out.println("No digit");
            ok = false;
        }
        if (!checkUpperCase(arr)) {
            System.out.println("No uppercase letter");
            ok = false;
        }
        if (!checkLowerCase(arr)) {
            System.out.println("No lowercase letter");
            ok = false;
        }
        if (!checkNonAlphanumeric(arr)) {
            System.out.println("No non-alphanumeric character");
            ok = false;
        }
        if (ok) {
            System.out.println("OK");
        }
        System.out.println();
    }

    public static boolean checkLength(char[] arr) {
        return arr.length >= 8;
    }

    public static boolean checkDifferentChars(char[] arr) {
        int[] tmp = new int[255];
        for (char c : arr) {
            tmp[c]++;
        }
        int count = 0;
        for (int i : tmp) {
            if (i > 0) {
                count++;
            }
        }
        return count >= 6;
    }

    public static boolean checkDigit(char[] arr) {
        for (char c : arr) {
            if (c >= '0' && c <= '9') {
                return true;
            }
        }
        return false;
    }

    public static boolean checkUpperCase(char[] arr) {
        for (char c : arr) {
            if (c >= 'A' && c <= 'Z') {
                return true;
            }
        }
        return false;
    }

    public static boolean checkLowerCase(char[] arr) {
        for (char c : arr) {
            if (c >= 'a' && c <= 'z') {
                return true;
            }
        }
        return false;
    }

    public static boolean checkNonAlphanumeric(char[] arr) {
        char[] test = "!@#$%^&*()_+-={}|:\"\';.,><?/".toCharArray();
        for (char c : arr) {
            for (char t : test) {
                if (c == t) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        char[][] passwords = {"AbcDe93".toCharArray(), "A1b:A1b>".toCharArray(), "Ab:Acb<".toCharArray(), "abc123><".toCharArray(), "Zorro@123".toCharArray()};
        for (char[] x : passwords) {
            passValidate(x);
        }
    }
}
