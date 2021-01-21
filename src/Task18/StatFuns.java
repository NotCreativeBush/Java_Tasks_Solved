package Task18;

public class StatFuns {
    static int maxOfThree(int a, int b, int c) {
        return Math.max(a,Math.max(b,c));
//TODO returning the value of the greatest of three numbers passed to the function;
    }
    static int greatestDivisor(int n) {
        int ans=1;
        for(int i=n-1;i>=2;i--){
            if(n%i==0){
                return i;
            }
        }
        return 1;
//TODO  returning the greatest divisor of n smaller than n (this will be 1 for prime numbers)
    }
    static boolean areRelativelyPrime(int a, int b) {
        for(int i=2;i<Math.min(a,b);i++){
            if(a%i==0&&b%i==0){
                return false;
            }
        }
        return true;
//TODO returning true if and only if a and b are relatively prime;
/*
Two integers a and b are said to be relatively prime, mutually prime, or coprime
if the only positive integer that divides both of them is 1.
 */
    }

    static boolean isPerfect(int n) {
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return (sum==n);
//TODO returning true if and only if n is a perfect number, i.e.,
// is the sum of all its divisors (including 1 but excluding n itself).
    }

    public static void main(String[] args) {
        int x = 2, y = 3, z = 1;
        System.out.println("Max of " + x + ", " + y + ", " +
                z + " is " + maxOfThree(x, y, z));

        for (int a = 12; a < 16; ++a)
            System.out.println("Greatest divisor of " +
                    a + " is " + greatestDivisor(a));

        for (int m = 11, n = 5; m >= 3; m -= 2, n += 2)
            if (areRelativelyPrime(m, n))
                System.out.println(m + " and " + n +
                        " are relatively prime");

        for (int m = 2; m <= 100; ++m)
            if (isPerfect(m))
                System.out.println(m + " is perfect");
    }
}
