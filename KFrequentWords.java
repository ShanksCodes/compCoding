import java.util.*;

class Solution {
    public List<String> topKFrequent(String[] words, int k) {    
       Map <String, Integer> map = new HashMap<>();
       for(String s: words)
        map.put(s, map.getOrDefault(s,0)+1);

       Queue <String> pq = new PriorityQueue<>(
         (w1,w2)-> map.get(w1).equals(map.get(w2))? w2.compareTo(w1): map.get(w1)-map.get(w2));
         
       for(String s: map.keySet())
        {
            pq.add(s);
            if(pq.size()>k)
             pq.poll(); //remove element from front, aka least frequency word
        }  
       List<String> list = new ArrayList<>();

       while(!pq.isEmpty())   
         list.add(pq.poll());

       Collections.reverse(list);
       return list;            
    }
}