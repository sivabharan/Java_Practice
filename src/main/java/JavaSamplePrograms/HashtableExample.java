package JavaSamplePrograms;
import java.util.*;
public class HashtableExample {
    public static void main(String args[]){
        Hashtable<Integer,String> map=new Hashtable<Integer,String>();

        map.put(100,"Amit");
        map.put(102,"Ravi");
        map.put(101,"Vijay");
        map.put(103,"Rahul");

        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());

        }
        System.out.println("Values before remove: "+ map);
        // Remove value for key 102
        map.remove(102);
        System.out.println("Values after remove: "+ map);
    }
}
