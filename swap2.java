// Swap of Two Numbers Without using Third Variables
// a=10  b=20
// a=20  b=10
import java.util.Scanner;
public class swap2 {
    public static void main(String[] args) {
        int a,b; 
         System.out.print("ente4r two numbers ");
        Scanner r =new Scanner(System.in);
        a =r.nextInt();
        b= r.nextInt();
        System.out.println("Before Swapping "+a+" "+b);

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.print("After Swapping "+a+ " "+b);
    }
}
