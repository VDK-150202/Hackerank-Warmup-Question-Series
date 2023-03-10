// Importing Map and HashMap classes
// from package names java.util
import java.util.HashMap;
import java.util.Map;
 
// Class for iterating HashMap using for loop
public class GFG {
 
    // Main driver method
    public static void main(String[] args)
    {
        // Creating a HashMap
        Map<String, String> foodTable
            = new HashMap<String, String>();
 
        // Inserting elements to the adobe HashMap
        // Elements- Key value pairs using put() method
        foodTable.put("A", "Angular");
        foodTable.put("J", "Java");
        foodTable.put("P", "Python");
        foodTable.put("H", "Hibernate");
 
        // Iterating HashMap through for loop
        for (Map.Entry<String, String> set :
             foodTable.entrySet()) {
 
            // Printing all elements of a Map
            System.out.println(set.getKey() + " = "
                               + set.getValue());
        }
    }
}
