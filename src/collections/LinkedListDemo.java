package collections;

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

    }
    
}



//ArrayList is backed by a dynamic array, so it provides fast random access using indexes.
// LinkedList is backed by a doubly linked list(data and pointer), so insertions and deletions are more efficient because elements don't need to be shifted. 
// However, accessing an element by index is slower in LinkedList because it requires traversal. 
// In practice, I prefer ArrayList unless there is a clear requirement for frequent insertions and deletions.


