// SSearch elements in array
// a[5] = 10 20 30 40 50
// Search item 70 ---->notfound

import java.util.Scanner;

public class array_search {
    public static void main(String[] args) {
        int a[] = new int[5];
        int n,count=0;
        Scanner ref=new Scanner(System.in);
        System.out.print("Enter Elements in Array ");
        for(int i=0; i<a.length; i++)
        {
            a[i] = ref.nextInt();
        }

        System.out.print("Elements in Array ");
        for(int i=0; i<a.length; i++)
        {
            System.out.print(a[i]+" ");
        }

        System.out.print("\nEnter Search Element ");
        n= ref.nextInt();
        for(int i=0; i<a.length; i++)
        {
            if(a[i]==n)
            {
                count++;
            }
        }
        if(count>0)
        {
            System.out.print("Item Found");
        }
        else
        {
            System.out.print("Item Not Found");
        }
    }
}
