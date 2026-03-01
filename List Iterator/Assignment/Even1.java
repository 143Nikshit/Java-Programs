package Assignment;

// Print Even Element Sum using iterator
import java.util.ArrayList;
import java.util.Iterator;

public class Even1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);
        list.add(30);

        Iterator<Integer> it = list.iterator();
        int sum = 0;

        while (it.hasNext()) {
            int num = it.next();
            if (num % 2 == 0) {
                sum += num;
            }
        }

        System.out.println("Sum of Even Elements: " + sum);
    }
}
