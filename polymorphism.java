class parent{
    void display(){
        System.out.println("This is parent class");
    }
}

class child extends parent{
    void cloth(){
        System.out.println("i need small underwear");
    }
    void display(){
        System.out.println("this is child class");
    }
}

public class Polymorphism {
    public static void main(String a[]){
    child c = new child();
    c.display();
    c.cloth();
    }
   
}
