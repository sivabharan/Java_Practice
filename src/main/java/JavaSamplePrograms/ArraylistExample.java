package JavaSamplePrograms;
import java.util.*;
public class ArraylistExample {
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        list.add("Ravi");//Adding object in arraylist
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");
        //Traversing list through Iterator
        Iterator itr=list.iterator();
        for(String obj:list)
            System.out.println(obj);
    }
    }

