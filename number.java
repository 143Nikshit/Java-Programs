// Check Number is positive or Negative
//  input n>0   +ve Number
//  input n<0  -ve Number
//  input n=0   Nether +ve or Negative
import java.util.Scanner;
public class number {
    public static void main(String[] args) {
          int n;
          System.out.print("Enter any Number ");
          Scanner ref=new Scanner(System.in);
          n = ref.nextInt();

          if(n>0)
          {
            System.out.print("Number is positive");
          }
          else if(n<0)
          {
            System.out.print("Number is negative");
          }
          else
          {
            System.out.print("Number is nether positive or negative");
          }
    }
}
