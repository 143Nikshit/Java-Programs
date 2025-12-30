public class pattern2 {
    public static void main(String[] args) {
        int i,j;
        // for(i=1; i<=5; i++)
        // {
        //     for(j=5; j>=i; j--)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.print("\n");
        // }

        for(i=5; i>=1; i--)  //rows
        {
            for(j=1; j<=i; j++) //columns
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
