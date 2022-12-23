package java_classes;

public class JavaConstructors {
    int id;
    String name;
    int age;
    //Constructor
    JavaConstructors(){
        System.out.println("Day la ham khoi tao Constructor khong tham so");
    }
    //Constructor 2 tham so
    JavaConstructors(int i, String n){
        id = i;
        name = n;
    }
    //Constructor 3 tham so
    JavaConstructors(int i, String n, int a){
        i = id;
        name = n;
        age = a;
    }

    void display(){
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String[] args) {
        JavaConstructors s1 = new JavaConstructors();
        JavaConstructors s2 = new JavaConstructors(121, "Alex");
        JavaConstructors s3 = new JavaConstructors(121, "Paul", 25);
        s1.display();
        s2.display();
        s3.display();
    }
}
