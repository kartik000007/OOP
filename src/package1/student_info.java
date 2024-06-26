package package1;

public class student_info {
    public static void main(String[] args) {
        student s1=new student(); // Default Constructor
        s1.age=20;// Set value using (.) operator

        student s2=new student(21);     // Parameterized Constructor
        s1.setRno(1);
        s1.name="abc";

        student s3=new student(s1);


        System.out.println(s1.age +" "+s1.name+" "+ s1.getRno());
        System.out.println(s3.age +" "+s3.name+" "+ s3.getRno());
    }
}

class student{
     protected int  age;
   private int rno;
    String name;
    student(){};  // Default Constructor
    student(int age) {  // Parameterized Constructor
        this.age =age; // This keyword is reference to class variable
    }

    student(student oldobject){     // Copy Constructor
        this.name=oldobject.name;
        this.rno=oldobject.rno;
        this.age=oldobject.age;
    }

    public void setRno(int rno) {   // Setter method to assign value to private variable
        this.rno = rno;
    }

    public int getRno() {
        return rno;              // Getter method to access value from the private variable
    }
}