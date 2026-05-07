package inheritence;

class Bank{
    double roi(){

    }
    void display(){
        System.out.println("This is a bank");
    }
}

class SBI extends Bank{
    double roi(){
        return 7.5;
    }
}

class ICICI extends Bank{
    double roi(){
        return 8.0;
    }
}   
public class MethodOverriding {
    public static void main(String[] args) {
        ICICI obj=new ICICI();
        System.out.println("ROI of ICICI: "+obj.roi());
        SBI obj1=new SBI();
        System.out.println("ROI of SBI: "+obj1.roi());

        Bank obj2=new ICICI(); // upcasting
        System.out.println("ROI of Bank reference to ICICI object: "+obj2.roi());
         Bank obj3=new SBI(); // upcasting  
        System.out.println("ROI of Bank reference to SBI object: "+obj3.roi());

    }
}
