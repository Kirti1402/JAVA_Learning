package collections;

import java.util.*;

public class HashcodeAndEqualsDemo {

    public static void main(String[] args) {
        HashMap<Person, String> map = new HashMap<>();
        Person p1 = new Person("John", 25);
        Person p2 = new Person("Sili", 25);
        Person p3 = new Person("john", 25);
        map.put(p1, "Engineer");
        map.put(p2, "Doctor");
        map.put(p3, "Teacher");

        //in object class hashcode and equals method is implemented in such a way that it will return different hashcode for different object even if the values are same
        System.out.println("Hashcode of p1: " + p1.hashCode());
        System.out.println("Hashcode of p2: " + p2.hashCode());
        System.out.println("Hashcode of p3: " + p3.hashCode());

        Map<String,Integer> map1 = new HashMap<>();
        map1.put("John", 25); //hashcode1-->index1
        map1.put("Sili", 25); //hashcode2-->index2
        map1.put("John", 90);//hashcode1-->index2 -->equals method will be called to check if the key is same or not->returns true because the key is same so it will replace the value with new value 90
        System.out.println("Hashcode of John: " + map1.get("John").hashCode());
        System.out.println("Hashcode of Sili: " + map1.get("Sili").hashCode());

    }
}

class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getNameString() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
