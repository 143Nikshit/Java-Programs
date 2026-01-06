// Java Program to check whether a number is Perfect Number or not

import java.util.Scanner;
class Ass1{
    public static void main(String[] args) {
        int num, sum=0;
        System.out.println("Enter any Number: ");
        Scanner r = new Scanner (System.in);
        num = r.nextInt();
        for(int i=1; i<=100; i++){
            if(num % i == 0){
                sum +=i;
            } 
        }
        System.out.println("Perfect Number are :"+sum);
        if(sum == 0){
            System.out.println("Perfect Number");
        }
    }
}