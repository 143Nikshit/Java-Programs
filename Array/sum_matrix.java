// Sum of two matrix

import java.util.Scanner;
public class sum_matrix {
    public static void main(String[] args) {
        int a[][] =new int [2][2];
        int b[][] =new int [2][2];
        int c[][] =new int [2][2];
        Scanner r = new Scanner(System.in);
        System.out.print("Enter frist matrix Data ");
        for(int i=0; i<2; i++)
        {
            for(int j=0; j<2; j++)
            {
                a[i][j] = r.nextInt();
            }
        }
        System.out.print("Enter second matrix Data ");
        for(int i=0; i<2; i++)
        {
            for(int j=0; j<2; j++)
            {
                b[i][j] = r.nextInt();
            }
        }
        System.out.print("First Matrix \n");
        for(int i=0; i<2; i++)
        {
            for(int j=0; j<2; j++)
            {
                System.out.print(a[i][j]+" ");
            }
        }
        System.out.print("First Matrix\n");
        for(int i=0; i<2; i++)
        {
            for(int j=0; j<2; j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.print("\n");
        }
        System.out.print("Second Matrix\n");
        for(int i=0; i<2; i++)
        {
            for(int j=0; j<2; j++)
            {
                System.out.print(b[i][j]);
            }
            System.out.print("\n");
        }
        System.out.print("Sum of Matrix\n");
        for(int i=0; i<2; i++)
        {
            for(int j=0; j<2; j++)
            {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.print('\n');
        }
    }
}
