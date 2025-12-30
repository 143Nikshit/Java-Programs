// Find Square root of a number
// input number 25 ----> 5
import java.util.Scanner;
import java.lang.Math;
public class squareroot {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter any Number ");
        Scanner ref = new Scanner(System.in);
        n = ref.nextInt();

        double m =Math.sqrt(n);
        System.out.print("Square root of "+n+" is "+m);
    }
}
