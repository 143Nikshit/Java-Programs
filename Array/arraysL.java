// Find Lenth of Arrays

import java.util.Scanner;

public class arraysL {
    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner r=new Scanner(System.in);
        System.out.print("Enter Elements in array ");

        for(int i=0; i<a.length; i++){
            a[i] = r.nextInt();
        }
        System.out.print("Array elements ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.print("\nArray Length "+ a.length);
    }
}
