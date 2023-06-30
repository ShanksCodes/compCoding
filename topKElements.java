import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Map;
import java.util.Arrays;
public class topKElements {
    
    public static int[] topKElements(int[] nums, int k) {
         HashMap <Integer,Integer> map= new HashMap<>();

         for(int el: nums)
          map.put(el, map.getOrDefault(el,0)+1);

         PriorityQueue <int[]> pq = new PriorityQueue<>((a,b)->(b[1]-a[1]));  //greater value greater priority
       
         for(Map.Entry<Integer,Integer> entry: map.entrySet())
          pq.offer(new int[]{entry.getKey(), entry.getValue()});

         int[] ans = new int[k];

         while(k>0){
          ans[k-1] = pq.poll()[0];
          --k;
         }
         
         return ans;  
    }

    public static void main(String args[]){
        int[]arr = {1,2,3,4,2,2,-4,6,5,6,6,6,6,3,3,3};
        int k =2;
        int[] ans = topKElements(arr, k);

        System.out.print("\nArray: ");
        for(int el: arr)
         System.out.print(el + " ");
        
        System.out.print("\nTop " + k + " elements: ");
        for(int el: ans)
         System.out.print(el + " "); 

         System.out.println("\n");
         System.out.println(Arrays.toString(ans));
         
          
        
    }
}
