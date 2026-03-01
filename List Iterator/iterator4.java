import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

class iterator4{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();    
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);

        System.out.println("=======================");

        ListIterator li = list.listIterator();
        while (li.hasNext()) {
            System.out.println(li.next());
        } 

        System.out.println("=======================");

        ListIterator li2 = list.listIterator(list.size());
        while (li2.hasPrevious()) {
            System.out.println(li2.previous());
        }

    }
}