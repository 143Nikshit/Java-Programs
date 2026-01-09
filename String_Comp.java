// Comparision of Strings in Java

public class String_Comp {
    public static void main(String[] args) {
        String a = "Lion";   // String Literals
        // String b = "Lion";   // True
        String b = new String("Lion");  // False
        if(a.equals(b))  //  a == b
        {
            System.out.print("True");
        }else{
            System.out.print("False");
        }

        if(a == b)  //  False
        {
            System.out.print("True");
        }else{
            System.out.print("False");
        }
    }
}
