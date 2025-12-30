// Find smallest element in array
import java.util.Scanner;
public class array_smallest {
    public static void main(String[] args) {
      int a[] = new int[5];
        int min;
        System.out.print("Enter Elements in array ");
        Scanner ref =new Scanner(System.in);
        for(int i=0; i<5; i++)
        {
            a[i] = ref.nextInt();
        }  
        min =a[0];
        for(int i=0; i<5; i++)
        {
            if (a[i] < min) {
                min=a[i];
            }
        }
        System.out.print("Smallest Element "+min);
    }
}
