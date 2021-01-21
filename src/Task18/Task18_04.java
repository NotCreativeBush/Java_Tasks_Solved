package Task18;

public class Task18_04 {
    static void checkISBN(String isbn) {
        int sum = 0;
        int ii = 1;
        for (int i = isbn.length() - 1; i >= 0; i--) {
            if ('0' <= isbn.charAt(i) && isbn.charAt(i) <= '9') {
                sum += (isbn.charAt(i) - '0') * ii;
                ii++;
            } else if (isbn.charAt(i) == 'X') {
                sum += (10 * ii);
                ii++;
            } else if (isbn.charAt(i) != '-') {
                System.out.println(isbn + ": ERROR. Invalid character " + isbn.charAt(i));
                return;
            }
        }
        if (ii > 11 || ii < 11) {
            System.out.println(ii < 11 ? isbn + " Too few digits" : isbn + " Too many digits");
            return;
        }
        System.out.println((sum % 11 == 0) ? (isbn + ": OK") : (isbn + ": No work"));
        System.out.println(sum % 11);
    }

    public static void main(String[] args) {
        String[] isbns = {
                "960-425-059-0", "80-902744-1-6", "85-359-0277-5", "0-8044-2958-X", "0-943396-04-2", "0-9752298-0-5", "9971-5-02l0-0", "93-8654--21-4", "99921-588-107",
        };
        for (int i = 0; i < isbns.length; i++) {
            checkISBN(isbns[i]);
        }
    }

}
