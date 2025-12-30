// maximum nummber between two number

import java.util.Scanner;
public class max {
    public static void main(String[] args) {
        int a, b;
        System.out.print("Enter two numbers ");
        Scanner r=new Scanner(System.in);
        a =r.nextInt();
        b =r.nextInt();
        if (a>b) {
            System.out.print(a);
        }
        else{
            System.out.print(b);
        }
    }
}
