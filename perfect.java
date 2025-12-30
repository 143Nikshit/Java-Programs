// perfect Number program
// input 6----> 1 2 3 4 5 
// 6 ----> 1 + 2 + 3
import java.util.Scanner;
public class perfect {
    public static void main(String[] args) {
        int n,sum=0;
        System.out.print("Enter any Number ");
        Scanner r = new Scanner(System.in);
        n = r.nextInt();

        for(int i=1; i<n; i++){
            if (n%i==0) {
                sum =sum+i;
            }
        }
        if (n==sum) {
            System.out.print("Perferct Number");
        }
        else{
            System.out.print("Not a Perferct Number");
        }
    }
}
