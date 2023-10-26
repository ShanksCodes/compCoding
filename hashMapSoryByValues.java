import java.util.Map;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.LinkedList;

public class hashMapSoryByValues {

    static LinkedHashMap<String,Integer> sortByVal(LinkedHashMap<String, Integer> map){
        Map <String, Integer> temp = new LinkedHashMap<String,Integer>();

    }
    

    public static void main(String args[]){
        Map<String,Integer> map = new LinkedHashMap<String,Integer>(); 
        map.put("A",1);
        map.put("D", 4);
        map.put("F",6);
        map.put("E",5);
        map.put("C",3);
        map.put("B",2); 

       System.out.println("-----------------------------------------------");
       System.out.println(map);
   

    }
}
