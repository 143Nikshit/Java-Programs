// String Reverse

public class String_Reverse {
    public static void main(String[] args) {
        // StringBuffer ref = new StringBuffer("Learn Coding");
        // System.out.println(ref.reverse());

        // StringBuilder r = new StringBuilder("Learn Coding");
        // System.out.println(r.reverse());

        int l;
        String r = "Learn Java";
        String r2 = "";
        l =r.length();

        for(int i = l-1; i>=0; i--)
        {
            r2 = r2 + r.charAt(i);
        }
        System.out.println(r2);
    }
}
