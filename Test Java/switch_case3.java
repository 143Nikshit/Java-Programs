import java.util.Scanner;
public class switch_case3 {
    public static void main(String[] args) {
        String Marks;
        System.out.println("Enter your Grade:");
        Scanner r = new Scanner(System.in);
        Marks = r.nextLine();   
        switch(Marks)
        {
            case "A":
                System.out.println("Excellent");
                break;
            case "B":
                System.out.println("Very Good");   
                break;
            case "C":
                System.out.println("Good");
                break;
            case "D":
                System.out.println("Average");
                break;
            case "E":
                System.out.println("Below Average");
                break;
            case "F":
                System.out.println("Fail");  
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
