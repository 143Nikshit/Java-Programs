public class pattern6 {
    public static void main(String[] args) {
        int i,j,k;
        for(i=1; i<=5; i++)  //row
        {
            for(j=5; j>i; j--)  //space
            {
             System.out.print(" ");
            }
            for(k=1; k<=i; k++)  //column
            {
             System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
