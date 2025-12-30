// Eligable for vote or not
import java.util.Scanner;
public class vote {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter Your Age ");
        Scanner r = new Scanner(System.in);
        age= r.nextInt();

        if(age>=18){
            System.out.println("You are Ealigible for vote");
        }
        else
        {
            System.out.println("You not are Ealigible for vote");
        }
    }
}
