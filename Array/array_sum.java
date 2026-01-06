// Sum of Array Elements 
import java.util.Scanner;
public class array_sum {
    public static void main(String[] args) {
        int a[] =new int[5]; int sum=0;
    System.out.print("Enter Elements in Array ");
    Scanner ref =new Scanner(System.in);
    for(int i=0; i<a.length; i++)    //for(int i=0; i<5; i++)
    {
        a[i] = ref.nextInt();
    }

    System.out.print("Array Elements ");
    for(int i=0; i<a.length; i++)     //for(int i=0; i<5; i++)
    {
        System.out.print(a[i]+" ");
        sum = a[i]+sum;
    }
    System.out.print("\nAddition of Array Elements "+sum);
    }
}
