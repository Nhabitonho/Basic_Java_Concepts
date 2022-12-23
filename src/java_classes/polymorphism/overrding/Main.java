package java_classes.polymorphism.overrding;

public class Main {
    public static void main(String[] args) {
        Shape s;
        s = new Rectangle();
        s.draw();
        s = new Circle();
        s.draw();
        s = new Triagle();
        s.draw();
    }
}
