//  find maximum number present in the list

import java.util.Iterator;
import java.util.ArrayList;

public class iterator2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();    
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
        Iterator<Integer> i = list.iterator();
        int max = Integer.MIN_VALUE;

        // To find the maximum number of the list
        while(i.hasNext())
        {
            int current = i.next();
            if(current > max)
            {
                max = current;
            }
        }
        System.out.println(max);

        // To print odd numbers in a list
        i = list.iterator();
        while(i.hasNext())
        {
            int odd = i.next();
            if(odd % 2 != 0)
            {
                System.out.println(odd);
            }
            System.out.print(odd+" ");
        }
    }
}
