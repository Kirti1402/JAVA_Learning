package collections;

import java.util.*;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>(11,0.3f,true);//double linked list is used to maintain the order of insertion
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        System.out.println("LinkedHashMap: " + map);

        map.get(1);

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        
    }
}

//order of insertion is preserved
//use when order of insertion is important
//linkedhashmap is slower than hashmap because of the extra overhead of maintaining the order of insertion
//load factor is 0.75
//intialcapacity is 16
//access true means it will maintain the order of access instead of insertion it will move the accessed element to the end of the list
