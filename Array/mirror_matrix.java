// Mirror Matrix using 2D Array

import java.util.Scanner;
public class mirror_matrix {
    public static void main(String[] args) {
        int a[][] = new int[2][2];
        Scanner r = new Scanner(System.in);
        System.out.println("Enter the elements of the matrix:");
        for(int i=0; i<2; i++)
        {
            for(int j=0; j<2; j++)
            {
                a[i][j] = r.nextInt();
            }
        }

        System.out.print("Array matrix :\n");
         for(int i=0; i<2; i++)
        {
            for(int j=0; j<2; j++)
            {
                System.out.print(a[i][j] +" ");
            }
            System.out.print("\n");
        }

        System.out.print("Mirror Matrix :\n");
        for(int i=0; i<2; i++)
        {
            for(int j=1; j>=0; j--)
            {
                System.out.print(a[i][j] +" ");
            }
            System.out.print("\n");
        }
    /*     for(int i=1; i>=0; i--)
        {
            for(int j=0; j<2; j++)
            {
                System.out.print(a[i][j] +" ");
            }
            System.out.print("\n");
        }  */ 
    }
}
