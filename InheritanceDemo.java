class animal{

    String name;
    public void sleep(){
        System.out.println("animal is sleeping");
    }

    public void eat(){
        System.out.println("animal is eating");
    }
}
class dog extends animal{

    public void run(){
        System.out.println("dog is running");
    }
    public void bark(){
        System.out.println("dog is barking");
    }
}
class cat extends dog{
    public void meow(){
        System.out.println("cat is meowing");
    }
    
}

public class InheritanceDemo {
    public static void main(String[] args){
        cat c = new cat();
        c.name = "mera name cat hai";
        c.eat();
        // c.run();
        c.meow();

        System.out.println("-----------------------------------------");
        System.out.println("abb dos ka obj bnaenge");
        dog d = new dog();
        d.name = "mera name dog hai";
        d.eat();
        d.run();
        d.bark();

    }
    
}
