import java.util.Scanner;
public class switch_case1 {
    public static void main(String[] args) {
        double Num1, Num2;
        System.out.println("Enter Number 1:");
        Scanner r = new Scanner(System.in);
        Num1 = r.nextDouble();
        System.out.println("Enter Number 2:");
        Num2 = r.nextDouble();
        System.out.println("Select Operator (+ , - , * , /, %):");
        char op = r.next().charAt(0);
        double result;
        switch(op)
        {
            case '+':
                result = Num1 + Num2;
                System.out.println("Addition is: " + result);
                break;
            case '-':
                result = Num1 - Num2;
                System.out.println("Subtraction is: " + result);
                break;
            case '*':
                result = Num1 * Num2;
                System.out.println("Multiplication is: " + result);
                break;
            case '/':
                result = Num1 / Num2;
                System.out.println("Division is: " + result);
                break;
            case '%':
                result = Num1 % Num2;
                System.out.println("Modulo is: " + result);
                break;
            default:
                System.out.println("Invalid Operator");
        }

    }
}
