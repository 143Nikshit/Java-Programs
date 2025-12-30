//  Convert character Lower to Upper & vice-vesa

import java.util.Scanner;
public class character {
    public static void main(String[] args) {
        char ch, ch2;
        System.out.print("Enter any Character ");
        Scanner ref=new Scanner(System.in);
        ch=ref.next().charAt(0);

        if(ch>='A' && ch<='Z')
        {
            ch2 = Character.toLowerCase(ch);
            System.out.print("LowerCase "+ch2);
        }
        else
        {
            ch2 = Character.toUpperCase(ch);
            System.out.print("Uppercase "+ch2);
        }
    }
}
