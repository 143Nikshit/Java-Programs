import java.util.ArrayList;   //ctrk +shift + o is the shprtcut to import class from package

class Example1 {

    public static void main(String[] args) {

        // How to create ArrayList object
        ArrayList ls = new ArrayList();

        // How to add elements
        ls.add(10);
        ls.add("Jayant");
        // Adding different types of elements in the same ArrayList i.e heterogeneous data
        ls.add(3.5);
        //true and false are boolean literals but they are autoboxed to Boolean objects when added to the ArrayList
        ls.add(true);
        ls.add(56.0f);

        // to add element at specific index
        ls.add(1,400);  
        System.out.println("size"+" "+ls.size());
        ls.add(2, 200);
        System.out.println("size"+" "+ls.size());
        ls.add(3, 300);
        System.out.println("size"+" "+ls.size());


        // System.out.println(ls.size());

        // Calling method
        ArrayList ls1 = getArrayList(ls);

        System.out.println(ls1);
    }

    // Method that returns ArrayList
    public static ArrayList getArrayList(ArrayList list) {
        list.add("Returned Element");
        return list;
    }
}
