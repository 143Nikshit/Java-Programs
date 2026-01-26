// 22. Print the cube of each number from 1 to n. 

import java.util.Scanner;

public class while_22 {
    public static void main(String[] args) {
        int i =1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        while(i <= n)
        {
            System.out.println("Cube of "+ i + " = " +(i * i *i));
            i++;
        }
    }
}
