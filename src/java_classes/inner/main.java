package java_classes.inner;

class OuterClass{
    int x = 10;
    static class InnerClass{
        int y = 5;
    }
}

public class main {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = new OuterClass.InnerClass();
        System.out.println(myOuter.x + myInner.y);
    }
}
