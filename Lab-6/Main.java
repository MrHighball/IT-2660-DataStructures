public class Main {
  public static void main(String[] args) {
      MyMap<String, Integer> creditHours = new MyHashMap<>();

      // Step 4: Add entries
      creditHours.put("IT-1025", 3);
      creditHours.put("IT-1050", 3);
      creditHours.put("IT-1150", 3);
      creditHours.put("IT-2310", 3);
      creditHours.put("IT-2320", 4);
      creditHours.put("IT-2351", 4);
      creditHours.put("IT-2650", 4);
      creditHours.put("IT-2660", 4);
      creditHours.put("IT-2030", 4);

      // Step 5: Check for keys
      System.out.println("Contains IT-1025: " + creditHours.containsKey("IT-1025")); // true
      System.out.println("Contains IT-2110: " + creditHours.containsKey("IT-2110")); // false

      // Step 6: Print all entries
      System.out.println("All credit hours:");
      for (String key : creditHours.keySet()) {
          System.out.println(key + ": " + creditHours.get(key));
      }

      // Step 7: Remove entries
      creditHours.remove("IT-2030");
      creditHours.remove("IT-1150");

      // Step 8: Print all entries again
      System.out.println("After removal:");
      for (String key : creditHours.keySet()) {
          System.out.println(key + ": " + creditHours.get(key));
      }
  }
}
