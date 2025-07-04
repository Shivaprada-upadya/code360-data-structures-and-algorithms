import java.util.Scanner;

class Fraction {

    private int num;

    private int den;

    public Fraction(int num, int den) {

        this.num = num;

        this.den = den;

        simplify();

    }

    public void add(Fraction f) {

        this.num = f.den * this.num + this.den * f.num;

        this.den = this.den * f.den;

        simplify();

        print();

    }

    public void multiply(Fraction f) {

        this.num = this.num * f.num;

        this.den = this.den * f.den;

        simplify();

        print();

    }

    public void print() {

        System.out.println(this.num + "/" + this.den);

    }

    private void simplify() {

        int gcd = gcd(this.num, this.den);

        this.num = this.num / gcd;

        this.den = this.den / gcd;

    }

    private int gcd(int a, int b) {

        if (b == 0)

            return a;

        return gcd(b, a % b);

    }

}

class Solution {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        Fraction f1 = new Fraction(in.nextInt(), in.nextInt());

        int t = in.nextInt();

        while (t > 0) {

            int op = in.nextInt();

            Fraction f2 = new Fraction(in.nextInt(), in.nextInt());

            if (op == 1) {

                f1.add(f2);

            } else if (op == 2) {

                f1.multiply(f2);

            }

            t--;

        }

    }

}