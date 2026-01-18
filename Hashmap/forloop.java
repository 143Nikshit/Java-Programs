 // Syntax for iterating over a Map using for-each loop in Java 
 //for (Map.Entry<Integer, Integer> e : Map.entrySet())

import java.util.HashMap;
import java.util.Map;

public class forloop {
    public static void main(String[] args) {
        // country(key), population(value)
        HashMap <String, Integer> map = new HashMap<>();

        // Insertion
        map.put("India", 120);
        map.put("USA", 60);
        map.put("China", 150);
        
        for(Map.Entry<String, Integer> e : map.entrySet())
        {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
    }
}
