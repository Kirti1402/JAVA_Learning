
package collections;

import java.util.*;

class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private final int capacity;

    public LRUCache(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args) {
        LRUCache<Integer, String> lruCache = new LRUCache<>(3);
        lruCache.put(1, "One");
        lruCache.put(2, "Two");
        lruCache.put(3, "Three");
        System.out.println("LRU Cache: " + lruCache);

        lruCache.get(1);
        System.out.println("After accessing key 1: " + lruCache);

        lruCache.put(4, "Four");
        System.out.println("After adding key 4: " + lruCache);
        lruCache.get(2);
        System.out.println("After accessing key 2: " + lruCache);
    }
}

//explaination
// In this code, we create a class LRUCache that extends LinkedHashMap. 
// We override the removeEldestEntry method to specify that the eldest entry should be removed when the size of the cache exceeds the specified capacity.
// The main method demonstrates the usage of the LRUCache by adding entries, accessing them, and showing how the least recently used entry is removed when the capacity is exceeded.
