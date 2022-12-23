package java_classes.encapsulation;

public class Main {
    public static void main(String[] args) {
        Person myObj = new Person("Alex", 20);
        System.out.println(myObj.getName() + " " + myObj.getAge());
        myObj.setName("john");
        myObj.setAge(24);
        System.out.println(myObj.getName() + " " + myObj.getAge());
    }
}
