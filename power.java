
// Claculate the power of a number
import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        int n, p, result = 1;
        System.out.println("Enter no. ");
        Scanner r = new Scanner(System.in);
        n = r.nextInt();
        System.out.println("Enter Power. ");
        p = r.nextInt();

        for (int i = 1; i <= p; i++) {
            result = n * result;
        }
        System.out.println(result);

    }
}
