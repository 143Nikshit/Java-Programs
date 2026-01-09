// Static and Non-Static Methods in Java

public class methods {
    int a=10;
    static int b=20;
    public static void main(String[] args) {
        methods r = new methods();
        r.Display();
        methods.Show();
    }
    static void Show()
    {
        System.out.println("Show() "+ b);
    }
    void Display()
    {
        System.out.println("Display()"+ a +" " + b);
    }
}
