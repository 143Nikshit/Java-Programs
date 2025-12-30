// Find average of array Elements
// 1. a[5] = 10 20 30 40 50 ---->150
// 2. avg=150/5
import java.util.Scanner;
public class array_average {
    public static void main(String[] args) {
        int a[] =new int[5];
        int sum=0; double avg;
        System.out.print("Enter Elements in an Array ");
        Scanner ref = new Scanner(System.in);
        for(int i=0; i<a.length; i++)
        {
            a[i] = ref.nextInt();
        }

        System.out.print("Array Elements  ");
        for(int i=0; i<a.length; i++)
        {
            System.out.print(a[i]+ " ");
        }

        for(int i=0; i<a.length; i++)
        {
            sum =a[i]+sum;
        }
        avg=sum/5.0;
        System.out.print("\nAddition "+sum+"\nAvg "+avg);
    }
}
