package Abstraction;

public class _interface {
    public static void main(String[] args) {
      //  A.printhello();     // Use interface static method by using interface name (.)
//        B b1=new B();
//        b1.print();
//        b1.goodMorning();  // interface default method calling from class object

//       K k1=new K();
//       k1.print();
//       k1.goodMorning();

        xyz x=new xyz();
        abc.printhello();

    }
}
class abc{
    static int  a=10;

     static  void printhello(){
        System.out.println("hello");
    }
    final public void print(){
        System.out.println("hello");
    }
}
class xyz extends abc{

}
interface A{
         void print();  // Abstract method

    // after JAVA 7
        public static void printhello(){             // You can Define static method with body in interface
            System.out.println("Hello Interface static method ");                // can't use with object
        }
        default void goodMorning(){
            System.out.println("default method from interface A");  // Default method with body
                                                    // You can use with the object which implemented interface
        }
}
interface C{
    void print();
    default void goodMorning(){
        System.out.println("default method from interface C");
    }
}

            // Multiple inheritance using Interface
            // if interface have same default method than multiple inheritance is not allowed
            // and only One method is called at a time
//class B implements A,C{
//    @Override
//    public void print() {
//        System.out.println("interface method implement by class ");
//    }
//                @Override
//                public void goodMorning() {   // same default method in interface than at a time only One default
//                                                // method can use
//                    A.super.goodMorning();
//                }
//}

interface D extends A,C{

    @Override
    void print();

    default void goodMorning() {
        System.out.println("default method from D interface");
    }
}

class K implements A,C,D{

    @Override
    public void print() {
        System.out.println("Implement in class K");
    }


}