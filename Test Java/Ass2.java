// Writa a java program ti find the 2nd maximum number among 5 numbers

public class Ass2 {
    public static void main(String[] args) {
        int a=10, b=20, c=30, d=40, e =50;
        if((a>b && a<c) || (a>d && a<e))
        {
            System.out.println(a);
        }else if((b>a && b<c) || (b>d && b<e)){
            System.out.println(b);
        }else if((c>a && c<b) || (c>d && c<e)){
            System.out.println(b);
        }else if((d>a && d<b) || (d>c && d<e)){
            System.out.println(b);
        }else{
            System.out.println(e);
        }
    }
}
