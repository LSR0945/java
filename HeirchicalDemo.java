
class vehicle{
    String brand;
    public void start(){
        System.out.println("vehicle is starting : " + brand);
    }
    public void run(){
        System.out.println("vehicle is running : " + brand);
    }
    public void stop(){
        System.out.println("vehicle is stopping : " + brand);
    }
}
class BMW extends vehicle{
    public void brand(){
        System.out.println("BMW is a brand");
    }
    public void sound(){
        System.out.println("BMW is making sound");
    }  
}
class Audi extends vehicle{
    public void brand(){
        System.out.println("Audi is a brand");
    }
    public void sound(){
        System.out.println("Audi is making sound");
    }
}
public class HeirchicalDemo {
    public static void main(String[] args) {
        BMW b = new BMW();
        b.brand = "BMW";
        b.start();
        b.run();
        b.stop();
        b.brand();
        b.sound();
        System.out.println("-----------------------------");
        System.out.println("abb audi ka obj bnaenge");
        Audi a = new Audi();
        a.brand = "Audi";
        a.start();
        a.run();
        a.stop();
        a.brand();
        a.sound();
    }}

