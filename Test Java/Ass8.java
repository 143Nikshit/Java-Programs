import java.util.Scanner;
public class Ass8 {
    public static void main(String[] args) {
        int num1, num2;
        System.out.println("Enter any two number : ");
        Scanner r =new Scanner (System.in);
        num1 = r.nextInt();
        num2 = r.nextInt();

        System.out.println("Enter any operand (+,-,/,*,%): ");
        char opr = r.next().charAt(0);

        double operation = 0;
        switch (opr) {
            case '+': operation = num1 + num2; System.out.println(operation);break;
            case '-': operation = num1 - num2; System.out.println(operation);break;
            case '*': operation = num1 * num2; System.out.println(operation);break;
            case '/': operation = num1 / num2; System.out.println(operation);break;
            case '%': operation = num1 % num2; System.out.println(operation);break;
            default: System.out.println("Invalid input");
                break;
        }
    }
}
