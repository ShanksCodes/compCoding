import java.util.TreeMap;
import java.util.Collections;
import java.util.Map;

public class kthLargestElement {
    
    public static int kthLargest(int[]nums, int k)
     {
        TreeMap <Integer, Integer> tm = new TreeMap<>(Collections.reverseOrder()); //descending order of keys

        for(int el:nums)
          tm.put(el, tm.getOrDefault(el,0)+1);

        int freq = 0;
        
        for(Map.Entry<Integer, Integer> m: tm.entrySet())
         {
            freq += (int)m.getValue();

            if(freq>=k)
             return (int)m.getKey();
         }

         return -1;

     }


    public static void main(String[] args){

       int[] nums = {5,4,4,3,0,-10};
       int k = 3;

       int result = kthLargest(nums, k);
       System.out.println("\n" + k + "th largest element is: " + result);

    } 

}
