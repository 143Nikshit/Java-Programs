// Find Biggest Element in Array
import java.util.Scanner;
public class array_biggest {
    public static void main(String[] args) {
        int a[] = new int[5];
        int max;
        System.out.print("Enter Elements in array ");
        Scanner ref =new Scanner(System.in);
        for(int i=0; i<5; i++)
        {
            a[i] = ref.nextInt();
        }
        max =a[0];
        for(int i=0; i<5; i++)
        {
            if (a[i]>max) {
                max=a[i];
            }
        }
        System.out.print("Maximum Element "+max);
    }
}
