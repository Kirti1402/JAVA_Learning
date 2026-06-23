package collections;
import java.util.*;
import java.util.Map.Entry;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(3,"Four");
        
        System.out.println("HashMap: " + map);
        System.out.println("Get value "+ map.get(3));

        System.out.println(map.containsKey(4));
        System.out.println(map.containsKey(3));
        System.out.println(map.containsValue("One"));

        Set<Integer> keys = map.keySet();//to get all keys
        System.out.println(keys);

        for(int i : keys){
            System.out.println(map.get(i));
        }

        Set<Map.Entry<Integer,String>> entries = map.entrySet();

        System.out.println(entries);

        for(Entry<Integer, String> e:entries){
            System.out.println(e.getKey()+":"+e.getValue());
        }
        for (Map.Entry<Integer, String> en : entries) {
            System.out.println(en.setValue(en.getValue().toUpperCase()));
        }

        map.remove(1);
        System.out.println(map);

        
    }
}

//value can have multiple null
//key only one null allowed
//if you put duplicate key it will replace the previous
//not thread safe
//O(1)


//Internal structure of Hashmap
//4 basic component

//key
//value
//bucket-> a place where key value pair is stored think as a array of linked list
//hash function-> it will take key and return a hashcode which will be used to find
//A hash function is a function that takes an input (in this case, the key) and produces a fixed-size integer value (the hash code). 
// The hash code is then used to determine the index of the bucket where the key-value pair will be stored in the HashMap. 

//When retrieving a value from the HashMap using a key, the hash function is again used to compute the hash code for the key, 
// which allows the HashMap to quickly locate the correct bucket and then search through any linked list or tree structure in that bucket 
// to find the corresponding value.

//How data is stored in HashMap
//1. When you call the put() method to add a key-value pair to the HashMap, the hash function is applied to the key to compute its hash code.
//2. The hashcode is then used to determine the index of the bucket where the key-value pair will be stored.
//3. If the bucket is empty, the key-value pair is simply added to that bucket
//4. If the bucket already contains one or more key-value pairs (i.e., a collision has occurred), the HashMap will use a linked list or a balanced tree (depending on the
//number of entries in the bucket) to store the new key-value pair alongside the existing ones.

//int index = hash(key) % arraySize; //this is how index is calculated
//collisions are handled by chaining (linked list) or tree structure (balanced tree) depending on the number of entries in the bucket.
//why collision happens? because hashcode is not unique for every key, different keys can have same hashcode which will lead to collision
//uses balance binary tree when number of entries in a bucket exceeds a certain threshold (default is 8) to improve performance of retrieval operations.


// hashmap has an internal array size which by default is 16, when the number of entries exceeds a certain threshold (default is 0.75 * array size), load factoer 0.75
// the internal array is resized to double its current size and all the existing entries are rehashed and redistributed into the new array. 
// This process is called rehashing.


//during rehashing, the hash function is applied to each key again to compute its new hash code, 
// and the key-value pairs are placed into their new buckets based on the new hash codes.








