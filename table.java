// Print Multiplication of Table
import java.util.Scanner;
public class table {
    public static void main(String[] args) {
        int num;
        System.out.print("Enter a Number ");
        Scanner r =new Scanner(System.in);
        num = r.nextInt();

        for(int i=1; i<=10; i++)
        {
            System.out.println(num+"*"+i+"="+num*i);
        }
    }
}
