// Area of Triangle
// input a,b,c
// 1. find semiperimeter
// 2. area of triangle
import java.util.Scanner;
import java.lang.Math;
public class triangle {
    public static void main(String[] args) {
        int a,b,c,sp;
        double area;
        System.out.print("enter value for side of triangle ");
        Scanner r= new Scanner(System.in);
        a=r.nextInt();
        b=r.nextInt();
        c=r.nextInt();

        sp= (a+b+c)/2;

        area=Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
        System.out.print("Area of triangle "+area);
    }
}
