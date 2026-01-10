// Write a java program to find the maximum no among two numbers with the help of conditional operator

import java.util.Scanner;
public class Ass12 {
    public static void main(String[] args) {
        int a, b;
        System.out.println("Enter two numbers: ");
        Scanner r = new Scanner(System.in);
        a = r.nextInt();
        b = r.nextInt();
        int max = (a > b) ? a : b;
        System.out.println("Maximum number is: " + max);
    }
}
