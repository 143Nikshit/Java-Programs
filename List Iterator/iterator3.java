import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

class iterator3{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();    
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);

        ListIterator li = list.listIterator();
        while (li.hasNext()) {
            System.out.println(li.next());
        } 

        System.out.println("Reverse order:");

        while (li.hasPrevious()) {
            System.out.println(li.previous());
        }
    }
}