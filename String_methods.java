// String Methods in Java

public class String_methods {
    public static void main(String[] args) {
        String a = "RAJA RAM";
        String b = "Brother Laxman";

        System.out.println(a.toLowerCase());
        System.out.println(b.toUpperCase());

        System.out.println(b.concat(a));
        System.out.println(b.length());

        String c = "    Sita Devi    ";
        String d = "Learn";
        System.out.println(c.trim());
        System.out.println(d.isEmpty());

        System.out.println(b.charAt(2));
        System.out.println(a.indexOf('A'));

        System.out.println(b.equals(a));
        System.out.println(d.replace('r', 'e'));

    }
}
