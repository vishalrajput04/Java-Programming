import java.util.*;
public class HashMapExample{
    public static void main(String[] args){
      
      HashMap<String, Integer> map = new HashMap<>();
      //insertion
      map.put("A",1);
      map.put("B",2);
      map.put("C",3);
      map.put("D",4);
      map.put("E",4);

      System.out.println(map);

      //Update value
     map.put("A", 2);
     System.out.println(map); // if key alrady exist so change the existing key valu like A = 1 after update A=2, and key is not present automatically inster new key;

      //Lookup or Search
              System.out.println(map.containsKey("A")); // True
              System.out.println(map.containsKey("F")); // false

      System.out.println(map.get("A")); // 1
      System.out.println(map.get("F")); // null

      //(i). iteration ( for-each loop)
      // Map.Entry<Integer, Integer> e : Map.entrySet()

      for(Map.Entry<String, Integer> e : map.entrySet() )
      {
        System.out.println(e.getKey());
        System.out.println(e.getValue());
      }

      //(i). iteration ( for-each loop)
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for(int key : arr){
          System.out.print(key + " ");
        }
    }
}
/* Basic funtions
   
HashMap<Integer, String> map = new HashMap<>();

map.put(1, "Vishal");        // Add/update
map.get(1);                  // Get value
map.remove(1);               // Remove
map.containsKey(1);          // Check key
map.containsValue("Vishal"); // Check value
map.size();                  // Number of entries
map.isEmpty();               // Check empty
map.clear();                 // Remove everything

*/