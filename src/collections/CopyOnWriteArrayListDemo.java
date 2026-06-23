package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        list1.add("Apple");
        list1.add("Bread");
        list1.add("Egg");

        try {
                    for(String s:list1){
            if(s == "Bread"){
                list1.add("egg");
            }
        }
        System.out.println(list1);
            
        } catch (Exception e) {
            System.out.println(e);
        }

// Give exception ConcurrentModificationException while reading we modifying
//ConcurrentModificationException occurs when a collection is modified while it is being iterated, and the modification is not performed through the iterator's own methods.
//Java collections use a fail-fast mechanism. When an iterator is created, it stores the collection's current modification count (modCount). 
// During iteration, it continuously checks whether the collection has been structurally modified. 
// If the current modCount differs from the stored value, the iterator throws ConcurrentModificationException.
        List<String> list2 = new CopyOnWriteArrayList<>();
        list2.add("code");
        list2.add("cse");
        list2.add("IT");

        for(String s:list2){
            System.out.println(s);
            if(s=="cse"){
                System.out.println("printing");
                list2.add("gradution");
            }
        }
        System.out.println(list2);


    }
}