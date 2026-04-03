//! WAJP to count the number of digits

import java.util.Scanner;
public class _08Count {
    public static void main(String[] args) {
         int num;
         int count =0;
        System.out.println("Enter a value");
        Scanner r = new Scanner(System.in);
        num = r.nextInt();

        while(num != 0)
        {
            num = num / 10;  // remove the last digits
            count++;
        }
        System.out.println(count);
    }
}
