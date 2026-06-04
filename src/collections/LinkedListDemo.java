package collections;

import java.util.*;

class Node{
    public int value;
    public Node next;
}
public class LinkedListDemo {
    public static void main(String[] args) {

        //demo to understand linked list
        Node node1 = new Node();
        Node node2 = new Node();
        node1.value = 1;
        node1.next = node2; //refrence to node2

        node1.value = 2;
        node2.next = null;

        System.out.println(node1.next);
        System.out.println(node2.next);

        //not stored in continious manner
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(10);
        list.add(5);
        list.add(3);
        list.add(1,14);

        System.out.println(list.get(2));
        list.addFirst(16);
        System.out.println(list);
        System.out.println(list.getLast());
        System.out.println(list.getClass());
        System.out.println(list.remove(1));
        System.out.println(list);
        
        LinkedList<String> animal = new LinkedList<>(Arrays.asList("Dog","Elephant","Cat"));
        LinkedList<String> animalALL = new LinkedList<>(Arrays.asList("Dog","Monkey","Cat"));
        animalALL.removeAll(animal);
        System.out.println(animal);
        System.out.println(animalALL);



    }
    
}



//ArrayList is backed by a dynamic array, so it provides fast random access using indexes.
// LinkedList is backed by a doubly linked list(data and pointer), so insertions and deletions are more efficient because elements don't need to be shifted. 
// However, accessing an element by index is slower in LinkedList because it requires traversal. 
// In practice, I prefer ArrayList unless there is a clear requirement for frequent insertions and deletions.


