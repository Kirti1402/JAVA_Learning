package collections;

import java.util.*;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(5);
        System.out.println(vector.capacity());
        vector.add(1);
        vector.add(4);
        vector.add(6);
        vector.add(9);
        vector.add(10);
        vector.add(12);
        System.out.println(vector.capacity());//it increase a size double in arraylist it increases 1.5x
        Vector<Integer> v2 = new Vector<>(Arrays.asList(1,2,3,4,5));
        System.out.println(v2);

    }
}

//vector is thread safe-extra memory that why its suggested to use arraylist for single threaded