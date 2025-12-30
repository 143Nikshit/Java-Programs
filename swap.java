// Swap of two numbers
import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
        int a,b,temp;
        System.out.print("ente4r two numbers ");
        Scanner r =new Scanner(System.in);
        a =r.nextInt();
        b= r.nextInt();
        System.out.println("Before Swapping "+a+" "+b);

        temp=a;
        a=b;
        b=temp;
        System.out.print("After Swapping "+a+ " "+b);

    }
}
