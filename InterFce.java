interface Animal{
    void sound();
    void eat();
}
class Dog implements Animal{
    @Override 
    public void sound(){
        System.out.println("dog is barks");
    }
    @Override
   public  void eat(){
        System.out.println("dog is eating");
    }
}
class cat implements Animal{
    @Override 
   public  void sound(){
        System.out.println("cat is meow");
    }
    @Override 
  public   void eat(){
        System.out.println("cat is eating");
    }
}


public class InterFce {
    public static void main(String[] args) {
    Dog d = new Dog();
    d.sound();
    d.eat();

    cat c = new cat();
    c.sound();
    c.eat();
    }
    

}
