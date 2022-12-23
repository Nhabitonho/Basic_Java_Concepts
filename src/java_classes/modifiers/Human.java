package java_classes.modifiers;

abstract class Human {
    public String name = "John";
    public int age = 24;
    // Abstract method
    public abstract void study();
}
class Student extends Human{
    public int graduationYear = 2023;
    @Override
    public void study() {
        // body of abstract
        System.out.println("Study all day long");
    }
}
