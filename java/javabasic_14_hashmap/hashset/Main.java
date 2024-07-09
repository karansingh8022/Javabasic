import java.util.*;

public class Main{
    
    public static void main(String args[]){
        
        // HashMap<String, Integer> map = new HashMap<>();
        
        // //put : O(1)
        // map.put("karan", 21);
        // map.put("kshitiz", 22);
        // map.put("harman", 23);
        
        // //get : O(1)
        // System.out.println(map.get("karan"));
        
        // //containsKey : O(1)
        // System.out.println(map.containsKey("karan"));
        
        // //remove : O(1)
        // // map.remove("karan");
        
        // //size
        // System.out.println(map.size());
        
        // //clear 
        // // map.clear();
        
        // //isEmpty
        // // System.out.println(map.isEmpty());
        
        // //iteration over a map
        // Set<String> keys = map.keySet();
        // System.out.println(keys);
        
        // for(String key: keys){
        //     System.out.println("keys: " + key + " value: " + map.get(key));
        // }
        
        // System.out.println(map);
        
        
        // LinkedHashMap<String, Integer> lm = new LinkedHashMap<>(); //this maintains the order in which they are passed
        
        // //lm
        // lm.put("karan", 100);
        // lm.put("kshitiz", 50);
        // lm.put("saurabh", 70);
        
        // System.out.println(lm);
        
        // TreeMap<String, Integer> tm = new TreeMap<>();
        
        // tm.put("karan", 10);
        // tm.put("kshitiz", 20);
        // tm.put("saurabh", 30);
        
        // System.out.println(tm);
        
        
        
        //**************HashSet******************
        
        HashSet<Integer> hs = new HashSet<>();
        
        //add
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(1);
        
        //size
        System.out.println(hs.size());
        
        //isEmpty()
        System.out.println(hs.isEmpty());
        
        //remove
        hs.remove(1);
        
        //contains
        System.out.println(hs.contains(2));
        
        //clear
        // hs.clear();
        
        System.out.println(hs);
        
        //iteration
        // for(Integer key: hs){
        //     System.out.print(key + " ");
        // }
        
        Iterator it = hs.iterator();
        
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
        
        
    }
}



/*
there are HashMap, LinkedHashMap, TreeMap
for TreeMap : put, get, remove is O(logn) impemented using Red Black Tree; they are sorted according to the keys

there are HastSet, LinkedHashSet, TreeSet
HashSet is implemented using HastMap, similarly LinkedHashSet is by LinkedHastMap and TreeSet using TreeMap
*/