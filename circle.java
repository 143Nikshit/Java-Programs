// Area of Cicle
import java.util.Scanner;
public class circle {
    public static void main(String[] args) {
        int r;
        final double PI=3.14, area;
        System.out.print("enter value of radius ");
        Scanner a= new Scanner(System.in);
        r=a.nextInt();
        area = PI*r*r ;
        System.out.print("Area of circle "+area);
    }
}
