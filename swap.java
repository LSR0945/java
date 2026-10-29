public class swap { 
    int a, b; 
    
    // 1. Default Constructor (Call_by_value wale obj ke liye chalta hai)
    public swap() { 
        this.a = 0; 
        this.b = 0; 
    } 
    
    // 2. Parameterized Constructor (Call_by_reference wale obj1 ke liye chalta hai)
    public swap(int x, int y) { 
        this.a = x; 
        this.b = y; 
    } 
    
    // Call by Value Method
    void Call_by_value(int a, int b) { 
        int temp = a; 
        a = b; 
        b = temp; 
        System.out.println("values after swap inside method a1: " + a + " b: " + b); 
    } 
    
    // Call by Reference Method
    void Call_by_reference(swap obj) { 
        int temp = obj.a; 
        obj.a = obj.b; 
        obj.b = temp; 
        // FIXED: obj.a aur obj.b print kiya taaki passed object ki values dikhein
        System.out.println("reference values after swap inside method a2: " + obj.a + " b: " + obj.b); 
    } 
    
    public static void main(String[] args) { 
        // Default constructor chalega (a=0, b=0)
        swap obj = new swap(); 
        int a = 10, b = 20; 
        
        System.out.println("Call by value before swapping a : " + a + " b : " + b); 
        obj.Call_by_value(a, b); 
        System.out.println("Call by value after swapping a : " + a + " b : " + b); 
        
        System.out.println("---------------------------------------------");
        
        // Parameterized constructor chalega (obj1.a=10, obj1.b=20)
        swap obj1 = new swap(a, b); 
        
        System.out.println("Call by reference before swapping a : " + obj1.a + " b : " + obj1.b); 
        obj1.Call_by_reference(obj1); 
        // FIXED: c aur d ki jagah obj1 ke fields print kiye kyunki badlav obj1 ke andar hua haiys
        System.out.println("call by reference ");
        System.out.println("Call by reference after swapping a : " + obj1.a + " b : " + obj1.b); 
    } 
}
