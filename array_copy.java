// Copy Array Elements
// first a[] 10,20,30 ----> second b[] =10,20,30
import java.util.Scanner;
public class array_copy {
    public static void main(String[] args) {
        int a[] = new int[5];
        int b[] = new int[5];

        System.out.print("Enter Elements in Array ");
        Scanner ref = new Scanner(System.in);
        for(int i=0; i<5; i++)
        {
            a[i] = ref.nextInt();
        }

        System.out.print("First Elements in Array ");
        for(int i=0; i<5; i++)
        {
            System.out.print(a[i]+" ");
        }

        System.out.print("\nSecond Elements in Array ");
        for(int i=0; i<5; i++)
        {
            b[i] = a[i];
            System.out.print(b[i]+" ");
        }
    }
}
