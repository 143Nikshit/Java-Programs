//  26. Find the HCF (Highest Common Factor) of two given numbers. 

import java.util.Scanner;

public class while_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int hcf = 1;
        int i = 1;

        while (i <= a && i <= b) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
            i++;
        }

        System.out.println("HCF = " + hcf);
    }
}
