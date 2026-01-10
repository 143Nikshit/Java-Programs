/* Vowel or Consonant in Java */

import java.util.Scanner;
class Ass15
{
 public static void main(String args[])
 { 
  char ch;
  System.out.print("Please enter a character ");
  Scanner r = new Scanner(System.in);
  ch = r.next().charAt(0);

  if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
      ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
  {
   System.out.print("Vowel");
  }
  else
  {
   System.out.print("Consonant");
  }
 }
}