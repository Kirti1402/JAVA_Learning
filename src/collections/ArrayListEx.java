package collections;
import java.util.*;

public class ArrayListEx {
    public static void main(String[] args) {
        int[] arr = new int[5]; // array is fixed in size
        ArrayList<Integer> list1 = new ArrayList<>(); // arraylist is dynamic in size
        List<Integer> list2 = new ArrayList<>(); // List is an interface and ArrayList is a class that implements List interface

        System.out.println("Array length: " + arr.length); // length is a property of array
        System.out.println("List1 size: " + list1.size()); // size is a method of ArrayList
        System.out.println("List2 size: " + list2.size()); // size is a method of List interface

        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        list1.add(60);
         System.out.println("List1 size: " + list1.size());
         System.out.println("List1: " + list1);//display the list
         System.out.println("List get index 2: " + list1.get(2)); // get method to access element at index 2

         for(int i=0;i<list1.size();i++){
            System.out.println("List1 element at index " + i + ": " + list1.get(i));
         }
         for(int x : list1){
            System.out.println("List1 element: " + x);
         }
         System.out.println("List1 contains 30: " + list1.contains(30)); // contains method to check if element is present in the list

        list1.remove(2); // remove element at index 2
        System.out.println("List1 after removing element at index 2: " + list1);
        list1.remove(Integer.valueOf(40)); // remove element with value 40
        System.out.println("List1 after removing element with value 40: " + list1);

        list1.add(2,16);//add with index and value
        System.out.println("List1 after adding 16 at index 2: " + list1);

        list1.set(3,14); // set element at index 3 with value 14 ..it will replace the existing element at index 3 with new value 14
        System.out.println("List1 after setting element at index 3: " + list1);

        ArrayList<Integer> list3 = new ArrayList<>(list1); // create a new ArrayList by copying elements from list1
        System.out.println("List3 (copy of List1): " + list3);

        ArrayList<Integer> list4 = new ArrayList<>(1000); // create a new empty ArrayList
        System.out.println("size of list4: " + list4.size()); // size is 0 because it is empty
        // System.out.println("get 0 of list4: " + list4.get(0)); //throws IndexOutOfBoundsException because list4 is empty and there is no element at index 0
        list4.add(1);
        list4.add(1);
        list4.add(1);
        System.out.println("size of list4 after adding elements: " + list4.size()); // size is 3 because we added 3 elements to list4
        list4.trimToSize();// trimToSize method is used to trim the capacity of the ArrayList to the current size of the list. 
        // It reduces the memory usage by removing any unused capacity.
        System.out.println("size of list4 after trimming: " + list4.size()); // size is 3 because we added 3 elements to list4

        List<String> list5 = new ArrayList<>(); // List of String type
        System.out.println(list5.getClass().getName()); // java.util.ArrayList

        List<String> list6 = Arrays.asList("Monday","Tuesday"); // create a list from an array using Arrays.asList() method
          System.out.println(list6.getClass().getName());// java.util.Arrays$ArrayList

        String[] arr2 = {"Wednesday","Thursday"};
        List<String> list7 = Arrays.asList(arr2); // create a list from an array using Arrays.asList() method
         System.out.println(list7.getClass().getName());// java.util.Arrays$ArrayList

         //Arrays.aslist method returns a fixed-size list backed by the specified array.
         // Any changes made to the list will be reflected in the array and vice versa.
         // The list returned by Arrays.asList does not support structural modifications such as adding or removing elements.
         // If you try to add or remove elements from the list returned by Arrays.asList, it will throw an UnsupportedOperationException.
         // However, you can modify the existing elements in the list using the set() method, and those changes will be reflected in the original array.
         

    }
}

//unlike regular arrays, ArrayList can grow and shrink dynamically as elements are added or removed. 
// It provides various methods to manipulate the list, such as add(), remove(), get(), set(), contains(), etc.
// Internally arraylist is implemented as an array of objects, and it automatically resizes itself when the capacity is exceeded.


//Note
//1. ArrayList is not synchronized, which means it is not thread-safe. 
// If multiple threads access an ArrayList concurrently, and at least one of the threads modifies the list structurally, it must be synchronized externally.
//2. ArrayList allows duplicate elements and maintains the insertion order of the elements.
//3. Intial default capacity of ArrayList is 10, when the number of elements exceeds the capacity,
//  it will automatically resize itself by creating a new array with a larger capacity and copying the existing elements to the new array.
//old capacity * 1.5 + 1 is the formula used to calculate the new capacity when resizing an ArrayList.
//4. Old array do not have reference after resizing, so it will be garbage collected by the JVM.

