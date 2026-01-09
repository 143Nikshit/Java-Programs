// Transpose of Matrix 

import java.util.Scanner;

public class transpose_matrix {
    public static void main(String[] args) {
        int a[][] = new int[2][2];
        Scanner r = new Scanner(System.in);

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = r.nextInt();
            }
        }

        System.out.println(" Elements of the matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(" Transpose of matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
    }
}
