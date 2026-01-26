// 16. Check whether the given number is a Perfect number. 
// 6 --- > 1 + 2 + 3 ---> perfect number

import java.util.Scanner;
public class while_16 {
    public static void main(String[] args) {
        int num, sum =0, i =1;
        System.out.print(" Enter any Number : ");
        Scanner r = new Scanner (System.in);
        num = r.nextInt();

        while(i < num)
        {
            if(num % i ==0)
            {
                sum = sum + i;
            }
            i ++;
        }
        // for(int i =1; i < num; i++)
        // {
        //     if(num % i == 0)
        //     {
        //         sum =+ i;
        //     }
        // }
        if (sum == num)
        {
            System.out.print("Enter Number is a perfect number ");
        }else{
            System.out.print("Enter Number is not a perfect number ");
        }
    }
}
