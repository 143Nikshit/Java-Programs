//  Create one list consist of 10 integers and find the submission using iterator

import java.util.ArrayList;
import java.util.Iterator;

class iterator1{

    int sum;

    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        System.out.println(l);
        Iterator<Integer> i = l.iterator();
        Integer sum = 0;
        while (i.hasNext()) {
            sum += i.next();            
        }
        System.out.println(sum);

        //  find maximum number present in the list
        Iterator<Integer> i2 = l.iterator();
        int max = Integer.MIN_VALUE;
        while(i.hasNext())
        {
            int current = i2.next();
            if(current > max)
            {
                max = current;
            }
        }
        System.out.println(max);

    }
}