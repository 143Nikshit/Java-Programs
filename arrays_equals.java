// Compare Arrays
// 1. ==
// 2. equals()

import java.util.Arrays;

public class arrays_equals {
    public static void main(String[] args) {
        int a[] = {10,20,30,40,50};
        int b[] = {10,20,30,40,50};

        if (Arrays.equals(a, b))
        {
         System.out.print("Both are Equals");
        }
        else
        {
            System.out.print("Both are not euals");
        }
       
    }
}
