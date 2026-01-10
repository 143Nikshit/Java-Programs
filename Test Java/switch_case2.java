import java.util.Scanner;
public class switch_case2 {
    public static void main(String[] args) {
        String Week;
        System.out.println("Enter Day:");
        Scanner r = new Scanner(System.in);
        Week = r.nextLine();
        switch(Week)
        {
            case "Monday":
                System.out.println("First Day of the Week");
                break;
            case "Tuesday":
                System.out.println("Second Day of the Week");   
                break;
            case "Wednesday":
                System.out.println("Third Day of the Week");
                break;
            case "Thursday":
                System.out.println("Fourth Day of the Week");
                break;
            case "Friday":
                System.out.println("Fifth Day of the Week");
                break;
            case "Saturday":
                System.out.println("Sixth Day of the Week");
                break;
            case "Sunday":
                System.out.println("Seventh Day of the Week");  
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
