// Print array elements in reverse order
// input a[5] = 10 20 30 40 50 ----> 50 40 30 20 10
import java.util.Scanner;
public class array_reverse {
    public static void main(String[] args) {
        int a[] = new int[5];
        System.out.print("Enter Elements in Array ");
        Scanner r =new Scanner(System.in);
        for(int i=0; i<5; i++)  //for(int i=0; i<a.length; i++)
        {
            a[i] = r.nextInt();
        }

        System.out.print("Array Elements ");
        for(int i=0; i<5; i++)  //for(int i=0; i<a.length; i++)
        {
            System.out.print(a[i]+" ");
        }

        System.out.print("\nArray Reverse Elements ");
        for(int i=5-1; i>=0; i--)  //for(int i=a.length-1; i>0; i--)
        {
            System.out.print(a[i]+" ");
        }

    }
}
