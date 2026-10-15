/**
 * Contructor
 */
import java.util.Scanner;
public class book {
        String title ;
        String author ;
        double price ;

    public book() {
        this.title = "";
        this.author = "";
        this.price = 0.0;
    }
    public book(String title,String author,double price) {
        this.title = title;
        this.author = author;
        this.price = price;

       
    }
    void display() {
        System.out.println("title : "+title);
        System.out.println("author : "+author);
        System.out.println("price : "+price);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      /*  System.out.println("Enter title : ");
        String title = sc.nextLine();
        System.out.println("Enter author : ");
        String author = sc.nextLine();
        System.out.println("Enter price : ");
        double price = sc.nextDouble();
        book obj = new book(title, author, price); // parameterized constructor
        book obj1 = new book(); // default constructor

        obj.display();
        obj1.display();
*/
        book obj = new book();
        book obj1 = new book("don","satish",100.0);
        obj.display();
        obj1.display();
    }
}