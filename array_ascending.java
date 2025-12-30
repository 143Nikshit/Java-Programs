// Sort elements in ascending order
// lets a[5] = 14 10  20 30 40 ----> 10 14 20 30 40 

import java.util.Scanner;
class ascending
{
public static void main (String args[])
 {
   int a[] = new int[5];
   int temp; 
   System.out.print("Enter Elements in an Array ");
   Scanner ref = new Scanner(System.in);
   for(int i=0; i<5; i++)
   {
    a[i] = ref.nextInt();
   }

   System.out.print("Array Elements before swapping ");
   for(int i=0; i<5; i++)
   {
    System.out.print(a[i]+" ");
   }
   
   for(int i=0; i<5; i++)   
   {
     for(int j=i+1; j<5; j++)
     {
      if (a[i]>a[j]) {
        temp =a[i];
       a[i] = a[j];
       a[j] = temp;
      }
     }
   }

   System.out.print("\nArray Elements After swapping ");

   for(int i=0; i<5; i++)
   {
    System.out.print(a[i]+" ");
   }
 }
}