package Abstraction;

public class example {
    public static void main(String[] args) {
//        Animal a1=new Animal()      // can't create the object of the abstraction class
          dog d1=new dog();
          d1.eat();
          d1.legs();

          Elephant e1=new Elephant();

          e1.eat();
          e1.legs();
        }
    }


abstract class Animal{    // 0 to 100% abstraction

    String name;     // normal Variable
    abstract void eat(); // Only define abstract method, can't have body
     void legs(){         // simple method with body
         System.out.println("have 4 legs");
     }
}

class dog extends Animal{
    @Override
    void eat() {
        System.out.println("Eat anythings");
    }
}

class Elephant extends Animal{
    void eat(){
        System.out.println("Eat veg");
    }
}