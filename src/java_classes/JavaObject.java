package java_classes;

public class JavaObject {
    static class Human {
        int x = 5;
        String fname = "John";
        String lname = "Doe";

    }

    static void myMethod() {
        System.out.println("Hello World !!!");
    }

    public static void main(String[] args) {
        Human myObj1 = new Human();// create an object of Human
        Human myObj2 = new Human();
        myObj1.x = 25;
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
        System.out.println("Name: " + myObj1.fname + " " + myObj1.lname);
        System.out.println("Age: " + myObj1.x);
        myMethod(); // call the static method
    }
}
