// 5. Print the multiplication table of a given number from n × 1 to n × 10.

public class while_5 {
    public static void main(String[] args) {
        int i = 1;
        int n = 5;
        while(i <= 10)
        {
            System.out.println(n + " x " + i + " = " + (n*i));
            i ++;
        }
    }
}
