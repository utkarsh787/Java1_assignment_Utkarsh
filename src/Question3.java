/*Explain the difference between method overloading and method overriding in Java. Provide code examples to illustrate both concepts.
//method overloading and method overriding are type of polymorphism in java oops and polymorphism means exist in many form
//method overloading is also known as (compile time polymorphism ) in which when we have lots of method with same name inside a class then when we create a
object out of which and calls method but with different parameter then the compiler will realize which method to run on the basis of number of parameter and
one important thing is that it does not depend on return type of a method if two method with same name but different return type then that is not example of compile time polymorphism

 */
class MathOperations {
    // Method with two integer parameters
    int add(int a, int b) {
        return a + b;
    }

    // Method with three integer parameters (different number of parameters)
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with two double parameters (different parameter types)
    double add(double a, double b) {
        return a + b;
    }
}

public class Question3 {
    public static void main(String[] args) {
        MathOperations obj = new MathOperations();

        System.out.println(obj.add(2, 3));         // Calls add(int, int)
        System.out.println(obj.add(2, 3, 4));      // Calls add(int, int, int)
        System.out.println(obj.add(2.5, 3.5));     // Calls add(double, double)
        //implementation for method overriding
        Parent obj1 = new Child(); // Parent reference, but Child object (runtime polymorphism)
        obj1.show(); // Calls Child's show() method
    }
}
/*method overriding is also known as (runtime polymorphism) which means when parent class have same method and we want child class to have same method with same parameter
and same return type but with different functionality then during runtime for java its difficult to understand  which method to call then  we override the parent class method
by child class method and hence at runtime  our child class method will implement .this is known as method overriding
 */
class Parent {
    void show() {
        System.out.println("This is the parent class method.");
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("This is the overridden method in the child class.");
    }
}

