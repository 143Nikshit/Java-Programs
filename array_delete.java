// Delete item in Array
// a[3] = 45 67 23
// a[3-1] = 43 23

import java.util.Scanner;
public class array_delete {
    public static void main(String[] args) {
        
        int size,loc,i;
        Scanner r = new Scanner(System.in);
        System.out.print("Enter Array Size ");
        size = r.nextInt();

        int a[] = new int [size+1];
        System.out.print("Enter Array Elements ");
        for(i=0; i<size; i++)
        {
            a[i] = r.nextInt();
        }

        System.out.print("Enter Array location ");
        loc = r.nextInt();
        for(i=loc;i<size-1; i++)
        {
            a[i] = a[i+1];
        }
        size--;
        for(i=0; i<size; i++)
        {
            System.out.print(a[i]+ " ");
        }
    }
}
