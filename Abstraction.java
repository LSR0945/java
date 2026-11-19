abstract class Abstract {
    abstract void circle();

}

 class square extends Abstract{
    void circle(){
        System.out.println("this is circle");
    }
    void square(){
        System.out.println("this is square");
    }
}

public class Abstraction{
    public static void main(String a[]){
        square s = new square();
        s.circle();
        s.square();
        
    }
}
