//  Leap Year Program
// 1. century (100%=0 and 400%=0)  2000  2400        1700 1800 1900
// 2. yearly (100%!=0 and 4%=0)    2020  2024        2021 2022 2023

import java.util.Scanner;

public class year {
    public static void main(String[] args) {
         int y;
         System.out.print("Enter any Year ");
         Scanner ref = new Scanner(System.in);
         y = ref.nextInt();

         if(y%100==0 && y%400==0 || y%100!=0 && y%4==0)
         {
            System.out.print("leap Year");
         }
         else
         {
            System.out.print("Not a leap Year");
         }
    }
}
