package collections;
import java.util.*;

class StringLengthComparator implements Comparator<String>{
    @Override
    public int compare(String s1,String s2){
        return 0;
    }
}

//sorting in ascending order
class MyComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2){
        return o1 - o2;
    }
}

//sorting in descending order
class MyComparatorDesc implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2){
        return o2 - o1;
    }
}


//sorting aesc length wise of string
class MyComparatorStringLengthWiseASC implements Comparator<String>{
    @Override
    public int compare(String o1, String o2){
        return o1.length() - o2.length();
    }
}


public class ComparatorDemo {
    public static void main(String[] args){
        List<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(2);
        list1.add(1);
        list1.sort(null);
        list1.sort(new MyComparator());
        System.out.println("Ascending Order"+list1);
        list1.sort(new MyComparatorDesc());
        System.out.println("Descending order"+list1);

        List<String> words = Arrays.asList("banana", "apple", "date","ok");
        words.sort(null);
        words.sort(new MyComparatorStringLengthWiseASC());
        System.out.println(words);
        List<String> words1 = Arrays.asList("banana", "apple","a" ,"date","ok");
        words1.sort((a,b)-> a.length()-b.length());
        System.out.println("Lambda Expression"+words1);

    }
}


// if result <  0 first come before second
// if result > 0  second come before second
// if result equal then equal