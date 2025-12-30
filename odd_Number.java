/* Print odd Number in a given range */
import java.util.Scanner;
class Sum
{
 public static void main(String args[])
 { 
  int n;
  System.out.print("Enter a Number ");
  Scanner r = new Scanner(System.in);
  n = r.nextInt();

  for(int i=1; i<=n; i=i+2)
  {
   System.out.print(i + " "); 
  }
 }
}
