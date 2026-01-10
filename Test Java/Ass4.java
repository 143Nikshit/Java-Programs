//write a java program to find factorial of a number

import java.util.Scanner;
public class Ass4 {
    public static void main(String[] args) {
        int num; int sum=1;
        System.out.print("Enter any Number :");
        Scanner r =new Scanner(System.in);
        num = r.nextInt();
        for(int i=1; i<=num; i++){
            sum = sum*i;
        }
        System.out.println("factor "+sum);
    }
}
