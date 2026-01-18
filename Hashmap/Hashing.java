import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashing {
    public static void main(String[] args)
    {
        // country(key), population(value)
        HashMap <String, Integer> map = new HashMap<>();

        // Insertion
        map.put("India", 120);
        map.put("USA", 60);
        map.put("China", 150);

        System.out.println(map);

        map.put("China", 180);
         System.out.println(map);

         // Search
         if(map.containsKey("USA")){
                System.out.println("Key is present in map");
            } else {
                System.out.println("Key is not present in map");    
         }

        System.out.println(map.get("India"));
        System.out.println(map.get("UK")); // null

        
        for(Map.Entry<String, Integer> e : map.entrySet())
        {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        map.remove("China");
        System.out.println(map);

    }
}