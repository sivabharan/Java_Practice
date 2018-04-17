package JavaSamplePrograms;
import java.util.HashMap;
import java.util.Map;

public class Hashmap {
      public static void main(String args[]) {
          Map<String,String> objMap = new HashMap<String,String>();
          objMap.put("Name","BMW");
          objMap.put("Class","SUV");
          objMap.put("Series","X5");
          System.out.println("Elements of the Map:" +objMap);
          //To return all available keys call as below
          System.out.println(objMap.keySet());
      }
}
