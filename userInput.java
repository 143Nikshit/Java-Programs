import java.util.Scanner;
class userInput
{
 public static void main (String args[])
 {
  int a,b;
  Scanner obj=new Scanner(System.in);
  System.out.print("Enter a value : ");
  a=obj.nextInt();
  b=obj.nextInt();
  System.out.print(a+" "+b);
 }
}