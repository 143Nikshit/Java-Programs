// How to use Methoda in java

import java.util.Scanner;
class methods_calci {
    int n1, n2;
    int add, sub, multi, div, rem;
    public static void main(String[] args) {
        methods_calci ref = new methods_calci();
        ref.input();
        ref.process();
        ref.output();
    }

    void input() {
        Scanner r = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        n1 = r.nextInt();
        n2 = r.nextInt();
    }

    void process() {
        add = n1 + n2;
        sub = n1 - n2;
        multi = n1 * n2;
        div = n1 / n2;
        rem = n1 % n2;
    }

    void output() {
        System.out.println("Addition: " + add);
        System.out.println("Subtraction: " + sub);
        System.out.println("Multiplication: " + multi);
        System.out.println("Division: " + div);
        System.out.println("Remainder: " + rem);
    }
}
