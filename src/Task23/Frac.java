package Task23;

import java.util.Objects;

public class Frac {
    private int num, denom;

    public Frac(int n, int d) {
        num = n/gcd(n,d);
        denom = d/gcd(n,d);

    }

    public Frac(int n) {
        num = n;
        denom = 1;
    }

    public Frac() {
        num = 0;
        denom = 1;
    }

    private int gcd(int n1,int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcd(n2, n1 % n2);
    }


    @Override
    public String toString(){
        if(denom==1){
            return num+"";
        }
        return num+"/"+denom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Frac frac = (Frac) o;
        return num == frac.num && denom == frac.denom;
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, denom);
    }

    public static Frac add(Frac a, Frac b) {
        int d = a.denom*b.denom;
        int n = a.num * b.denom + b.num * a.denom;
        return new Frac(n, d);
    }

    public Frac add(Frac other) {
        int d = denom*other.denom;
        int n = num * other.denom + other.num * denom;
        return new Frac(n, d);
    }

    public static Frac sub(Frac a, Frac b) {
        int d = a.denom*b.denom;
        int n = a.num * b.denom - b.num * a.denom;
        return new Frac(n, d);
    }

    public Frac sub(Frac other) {
        int d = denom*other.denom;
        int n = num * other.denom - other.num * denom;
        return new Frac(n, d);
    }

    public static Frac mul(Frac a, Frac b) {
        int n = a.num * b.num;
        int d = a.denom * b.denom;
        return new Frac(n, d);
    }

    public Frac mul(Frac other) {
        int n = num * other.num;
        int d = denom * other.denom;
        return new Frac(n, d);
    }

    public static Frac div(Frac a, Frac b) throws ArithmeticException {
        if (b.num == 0) {
            throw new ArithmeticException();
        }
        int n = a.num * b.denom;
        int d = Math.abs(a.denom * b.num);


        return new Frac(n, d);
    }

    public Frac div(Frac other) throws ArithmeticException {
        if (other.num == 0) {
            throw new ArithmeticException();
        }
        int n = num * other.denom;
        int d = denom * other.num;

        return new Frac(n, d);
    }


}
