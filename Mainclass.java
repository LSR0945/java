
class Primaryclass { 
    public String name; 
    private int age; 

    public void getdata(String n, int a) { 
        this.name = n; 
        this.age = a; 
    } 

    public void modifydata(int a) { 
        this.age = this.age + a; 
    } 

    public void displaydata() { 
        System.out.println("Name: " + this.name); 
        System.out.println("Age: " + this.age); 
    } 
} 


public class Mainclass { 
    public static void main(String[] args) { 
       
        Primaryclass obj = new Primaryclass(); 
        obj.name = "satish"; 
        //  obj.age = 25; 

        obj.getdata(obj.name, 25); 

        obj.displaydata(); 
        obj.modifydata(5); 
        obj.displaydata(); 
    } 
}
