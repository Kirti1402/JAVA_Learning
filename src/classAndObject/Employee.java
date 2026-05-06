package classAndObject;

class Employee {
    //variables
    int eId;
    String ename;
    String job;
    int sal;
    //methods
    void display() {
        System.out.println(eId + " " + ename + " " + job + " " + sal);
    }

    public static void main(String[] args) {
           Employee e1 = new Employee();
           e1.eId = 101;
           e1.ename = "John";
           e1.job = "Developer";
           e1.sal = 50000;
           e1.display();
    }

    
}