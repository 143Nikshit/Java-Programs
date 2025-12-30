/*Sum of Two numbers program*/
import java.util.Scanner;
class Add
{
 public static void main (String args[])
 {
  int a,b,sum;
  System.out.print("Enter two Number ");
  Scanner r = new Scanner(System.in);
  a = r.nextInt();
  b = r.nextInt();
  sum = a+b;
  System.out.print("Addition = " + sum);
 }
}
