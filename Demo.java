public class Demo {
    static int a = 10;

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Hello, World!");
        System.out.println("hello");

        Demo2 obj = new Demo2();
        obj.display();
    }
}

class Demo2 {
    void display() {
        Demo.a = 20;
     //    System.out.println("Hello, World!");
        System.out.println("Value of a = " + Demo.a);
    }
}


