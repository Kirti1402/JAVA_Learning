package collections;

import java.util.*;

public class WeakHashMapDemo {

    public static void main(String[] args) {
        WeakHashMap<String, Image> weakHashMap = new WeakHashMap<>();
        weakHashMap.put("image1", new Image("Image 1"));
        weakHashMap.put("image2", new Image("Image 2"));
        System.out.println("WeakHashMap before GC: " + weakHashMap);
        simulateApplicationRunning();
        System.gc();
        System.out.println("WeakHashMap after GC: " + weakHashMap);

        String Key1 = new String("image1");
        String Key2 = new String("image2");
        weakHashMap.put(Key1, new Image("Image 1"));
        weakHashMap.put(Key2, new Image("Image 2"));
        System.out.println("WeakHashMap before GC: " + weakHashMap);
        Key1 = null;
        Key2 = null;
        simulateApplicationRunning();
        System.gc();
        System.out.println("WeakHashMap after GC: " + weakHashMap);

    }
    private static void simulateApplicationRunning(){
        try {
            Thread.sleep(10000);
        } catch (Exception ignore) {
    }
}

}

class Image {

    private String name;

    public Image(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

}

//weakhashmap is a hashmap that uses weak references for keys. 
// It means that if a key is no longer referenced by any other object, it will be removed from the map automatically. 
// It is useful for caching purposes where we want to allow the garbage collector to reclaim memory when needed.

//string key is strongly referenced in the weakhashmap so it will not be removed from the map even if it is no longer referenced by any other object.

