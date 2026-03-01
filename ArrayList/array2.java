import java.util.ArrayList;

class array2 {
    // create a method which will return arraylist object
    public static ArrayList createArrayList()
    {
        return new ArrayList();
    }
    public static void main(String[] args) {
        ArrayList ls = new ArrayList();
        System.out.println("Size :" +ls.size());

            ls.add(10);
            ls.add(20);
            ls.add(30);
            ls.add(23.50);
            ls.add(true);
            ls.add("King");
            System.out.println(ls);    
            System.out.print("Size :"+ ls.size());

            ls.add(2,200);
            System.out.println(ls); 
            System.out.print("Size :"+ ls.size());
    }
}
