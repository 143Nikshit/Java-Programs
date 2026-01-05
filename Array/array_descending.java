// Sort array Elements in Descending Order
// lets a[5] = 34 56 78 32 12 ---> 78 56 34 32 12

import java.util.Scanner;

public class array_descending {
    public static void main(String[] args) {
        int a[] = new int[5];
        int temp;
        System.out.print("Enter Elements in array ");
        Scanner ref = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            a[i] = ref.nextInt();
        }
        System.out.print("Array Elements before swapping ");
        for (int i = 0; i < 5; i++) {
            System.out.print(a[i] + " ");
        }
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("\nArray Elements After swapping ");

        for (int i = 0; i < 5; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
