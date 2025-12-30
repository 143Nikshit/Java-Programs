// Insert item in array
// a[3] = 34 67 23
// location = 1   item =100
// a[3+1] = 34 100 67 23
import java.util.Scanner;
public class array_insert {
    public static void main(String[] args) {
        int size,loc,item,i;
        Scanner r =new Scanner(System.in);
        System.out.print("Enter Array Size ");
        size = r.nextInt();

        int a[] = new int[size+1];
        System.out.print("Enter Array Elements ");
        for(i=0; i<size; i++)
        {
            a[i]=r.nextInt();
        }

        System.out.print("Enter Array Location ");
        loc = r.nextInt();
        System.out.print("Enter new item ");
        item = r.nextInt();

        for(i=size; i>loc; i--)
        {
            a[i] = a[i-1];
        }
        a[loc] = item;
        size++;

        for(i=0; i<size; i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
