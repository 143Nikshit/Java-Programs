// Constructor OverLoading

class A {
    int a; double b; String c;
    // private A()
    // {
    //     a = 101; b = 21.5; c = "Hello";
    // }
    A()  // Default Constructor
    {
        a = 100; b = 20.5; c = "Hello";
    }
    A(int x)
    {
        a=x;
    }
    A(double y, String z)
    {
        b=y; c = z;
    }
}
class constructor {
    public static void main(String[] args) {

        A r =new A();
        A r2 =new A(10);
        A r3 =new A(23.89, "Java");

        System.out.println(r.a+" "+r.b+" "+r.c);
        System.out.println(r2.a);
        System.out.println(r3.b+" "+r3.c);
    }
}
