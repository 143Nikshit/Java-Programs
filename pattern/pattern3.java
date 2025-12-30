public class pattern3 {
    public static void main(String[] args) {
        int i, j, k ;
    // for(i=1; i<=5; i++) //row
    // {
    //     for(j=i; j<5; j++) //space
    //     {
    //       System.out.print(" ");
    //     }
    //     for(k=1; k<=i; k++) //column
    //     {
    //       System.out.print("*");
    //     }
    //     System.out.print("\n");
    // }

    for(i=1; i<=5; i++) //row
    {
        for(j=1; j<i; j++) //space
        {
          System.out.print(" ");
        }
        for(k=i; k<=5; k++) //column
        {
          System.out.print("*");
        }
        System.out.print("\n");
    }
 }
}
