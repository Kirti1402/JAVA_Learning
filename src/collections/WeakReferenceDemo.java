package collections;

import java.lang.ref.WeakReference;

public class WeakReferenceDemo {
    public static void main(String[] args) {
        // Phone phone1 = new Phone("Apple", "iPhone 13");
        // System.out.println(phone1);
        // phone1 = null; // Remove the strong reference to phone1
        // System.out.println("Phone 1 after nullifying reference: " + phone1);

        WeakReference<Phone> weakPhoneRef = new WeakReference<>(new Phone("Samsung", "Galaxy S21"));
        System.out.println("Weak reference before GC: " + weakPhoneRef.get());
        try{
            Thread.sleep(1000); // Wait for a moment to allow GC to complete
        } catch (Exception ignored) {
        }

        System.out.println("Weak reference after GC: " + weakPhoneRef.get());   // This may return null if the object has been garbage collected
    } 

}

class Phone {
    private String brand;
    private String name;

    public Phone(String brand, String name) {
        this.brand = brand;
        this.name = name;
    }

    String getBrand() {
        return brand;
    }
    String getName() {
        return name;
    }

}




//garbage collector will remove the entry from the map if the key is no longer referenced anywhere else in the program. 
// This is useful for caching scenarios where you want to allow the keys to be garbage collected when they are no longer needed, preventing memory leaks.

// WeakHashMap is not synchronized, so if multiple threads access a WeakHashMap concurrently, and at least one of the threads modifies the map structurally, it must be synchronized externally.
