import java.util.ArrayList;
import java.util.Scanner;

public class search2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> name = new ArrayList<String>();    
        name.add("Bheem");
        name.add("Chutki");
        name.add("Raju");
        name.add("kaliya");
        name.add("Indumati");

        System.out.println(name);
        System.out.println("=======================");
        System.out.println("Enter Element to check position");
        String keyElement = sc.nextLine();

        System.out.println(name.indexOf(keyElement));

    }
}
