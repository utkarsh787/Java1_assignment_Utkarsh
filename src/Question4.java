// Define an interface Shape with an abstract method draw()
interface Shape {
    void draw();
}

// Implement the Shape interface in the Circle class
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle.");
    }
}

// Implement the Shape interface in the Rectangle class
class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle.");
    }
}

// Main class to demonstrate polymorphism
public class Question4 {
    public static void main(String[] args) {

        Shape shape1 = new Circle();
        shape1.draw();


        Shape shape2 = new Rectangle();
        shape2.draw();
    }
}
