// sort()  equals()  copyOf()

import java.util.Scanner;
import java.util.Arrays;
public class array_methods {
    public static void main(String[] args) {
        int a1[] = new int[5];
        // int a2[] = new int[5];
        System.out.print("Enter Data in array 1 ");
        Scanner ref = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            a1[i] = ref.nextInt();
        }

        System.out.print("Data in array 2 ");
        int a2[] = Arrays.copyOf(a1, 5);
        for (int i = 0; i < 5; i++) {
             System.out.print(a2[i]+ " ");
         }

        
        // System.out.print("Enter Data in array 2 ");
        // for (int i = 0; i < 5; i++) {
        //     a2[i] = ref.nextInt();
        // }

        // boolean b = Arrays.equals(a1, a2);
        // System.out.print("Kya Dono Array Equal Hai "+b);

        // Arrays.sort(a);
        // for (int i = 0; i < 5; i++) {
        //     System.out.print(a[i]+ " ");
        // }


    }
}
