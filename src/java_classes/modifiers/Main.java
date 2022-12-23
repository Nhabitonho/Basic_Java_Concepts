package java_classes.modifiers;

public class Main {
    public static void main(String[] args) {
        Student myObj = new Student();
        System.out.println("Name: " + myObj.name);
        System.out.println("Age: " + myObj.age);
        System.out.println("GraduationYear: " + myObj.graduationYear);
        myObj.study(); // call abstract method
    }
}
