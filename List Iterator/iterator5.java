// Iterating an ArrayList using for loop...

import java.util.ArrayList;

public class iterator5 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();    
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);

        System.out.println("=======================");
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }

             System.out.println("=======================");

            // Adding for each loop ...
            for(int element: list)
            {
                System.out.println(element);
            }
    }
}
