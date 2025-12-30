/* Print character in Java */

import java.util.Scanner;
class charPrint
{
 public static void main(String args[])
 { 
  char ch;
  System.out.print("Please enter a character ");
  Scanner r = new Scanner(System.in);
  ch = r.next().charAt(0);
  System.out.print(ch);

 }
}