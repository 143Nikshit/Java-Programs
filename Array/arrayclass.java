//  toString()  asList()  deepToString()

import java.util.Arrays;
public class arrayclass {
    public static void main(String[] args) {
        // Single Dimensional Array
        String a[] = {"Learn", "Coding", "Keypoints", "Education"};

        System.out.print("toString() "+Arrays.toString(a));

        System.out.print("asList "+Arrays.asList(a));

        // Multi-Dimensional Array
        int arr[][] ={ {10,20}, {30,40} };
        System.out.print("deepToString() "+Arrays.deepToString(arr));
    }
}
