// Enter month number & print number of days in a month

import java.util.Scanner;

public class month {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter month number ");
        Scanner r=new Scanner(System.in);
        n =r.nextInt();

        switch (n) {
            case 1:
                System.out.print("Jan = 31 DAys");
                break;
            case 2:
                System.out.print("Feb = 28 DAys");
                break;
            case 3:
                System.out.print("March = 31 DAys");
                break;
            case 4:
                System.out.print("April = 30 DAys");
                break;
            case 5:
                System.out.print("May = 31 DAys");
                break;
            case 6:
                System.out.print("June = 30 DAys");
                break;
            case 7:
                System.out.print("July = 31 DAys");
                break;
            case 8:
                System.out.print("August = 31 DAys");
                break;
            case 9:
                System.out.print("Sep = 30 Days");
                break;
            case 10:
                System.out.print("Oct = 31 DAys");
                break;
            case 11:
                System.out.print("Nov = 30 DAys");
                break;
            case 12:
                System.out.print("Dec = 31 DAys");
                break;
            default:
                System.out.print("Invalid Number");
                break;
        }
    }
}
