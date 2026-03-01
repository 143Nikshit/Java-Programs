import java.util.ArrayList;

class Book {
    int id;
    String name;
    int price;
    
    Book(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    
    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", name='" + name + '\'' + ", price=" + price + '}';
    }
}

public class ToAddGenricArrayList {
    public static void main(String[] args) {

        //generics is used to store homogeneous data in the collection and to avoid type casting while retrieving the data from the collection
        ArrayList<Integer> ls = new ArrayList<Integer>();
        ls.add(10);
        ls.add(20);
        System.out.println(ls);
        System.out.println("======");

        ArrayList<Book> ls2 = new ArrayList<Book>();
        ls2.add(new Book(101, "Java", 500));
        ls2.add(new Book(102, "Python", 600));
        System.out.println(ls2);
        
    }
}
