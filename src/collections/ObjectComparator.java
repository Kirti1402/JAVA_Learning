package collections;
import java.util.*;



class Student {
    private String name;
    private double gpa;

    public Student(String name, double gpa){
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
            return name;
    }
    public double getGpa(){
        return gpa;
    }
}

public class ObjectComparator {
    public static void main(String[] args)  {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Kirti", 7.89));
        students.add(new Student("Swati", 9.09));
        students.add(new Student("Om", 8.00));
        students.add(new Student("Aishanya", 8.78));

        students.sort((o1,o2)-> {
            if(o2.getGpa() - o1.getGpa()>0){
                return 1;
            } else if(o2.getGpa() - o1.getGpa()<0){
                return -1;
            }else{
                return 0;
            }
        });
        for(Student s: students){
            System.out.println(s.getName()+" : "+s.getGpa());
        }
        System.out.println();
        try {
            students.sort(null);
        } catch (Exception e) {
            System.out.println("Exception Message: "+e.getMessage());
        }finally{
            System.out.println("Finally block of try catch");
        }
        

    }
}

// if result <  0 first come before second
// if result > 0  second come before second
// if result equal then equal