import java.util.Scanner;
public class carcontructor {
    String brand;
    String model;
    int year;
    carcontructor() {
        
        this.brand = "";
        this.model = "";
        this.year = 0;
    }
    carcontructor(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    void display() {
        System.out.println("brand : "+brand);
        System.out.println("model : "+model);
        System.out.println("year : "+year);
    }
    public static void main(String[] args) {
        // carcontructor obj = new carcontructor();
        // carcontructor obj1 = new carcontructor("BMW","X5",2020);
        // obj.display();
        // obj1.display();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter brand : ");
        String brand = sc.nextLine();
        System.out.println("Enter model : ");
        String model = sc.nextLine();
        System.out.println("Enter year : ");
        int year = sc.nextInt();
        carcontructor obj2 = new carcontructor(brand, model, year);
        carcontructor obj3 = new carcontructor();

        obj2.display();
        obj3.display();
        sc.close();
    }
}
