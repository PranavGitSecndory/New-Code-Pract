//3. Write a Java program to copy all mappings 
//from the specified map to another map.
//
//4. Write a Java program to remove all mappings from a map.
//
//5. Write a Java program to check whether a map 
//contains key-value mappings (empty) or not.
//
//6. Write a Java program to get a shallow copy of
//a HashMap instance.

package map;

import java.util.HashMap;
import java.util.Map;

public class map_Q3_4_5_6 {
public static void main(String[] args) {
    Map<Integer, String> map = new HashMap<>();

    map.put(1, "Apple");
    map.put(2, "Banana");
    map.put(3, "Cherry");
    
    Map<Integer, String> map1 = new HashMap<>();
    map1.putAll(map);
    System.out.println(map1);
    
    map1.clear();
    System.out.println(map1);
    
    System.out.println(map.isEmpty());
    System.out.println(map1.isEmpty());
    
    Map<Integer, String> map2 = new HashMap<>(map);
    System.out.println(map2);
    
  
    System.out.println(  map.get(3));
    
    
}
}
