package java_classes.polymorphism.overrding;

public class Circle extends Shape{
    @Override
    void draw() {
        System.out.println("drawing Circle...");
    }
}
