// Find Factorial of a number
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        
        int n,fact=1;
        System.out.println("Enter a Number ");
        Scanner r = new Scanner(System.in);
        n= r.nextInt();

        for(int i=1; i<=n; i++){
            fact= fact*i;
        }
        System.out.println("factoria " +fact);
    }
}
