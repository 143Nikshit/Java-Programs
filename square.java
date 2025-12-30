// Area of square
import java.util.Scanner;
public class square {
    public static void main(String[] args) {
        int si,area;
        System.out.print("enter side of square ");
        Scanner r= new Scanner(System.in);
        si=r.nextInt();
        area = si*si ;
        System.out.print("Area of square "+area);
    }
}


