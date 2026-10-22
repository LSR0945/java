public class Method_overloading {
    
    // Changed return type to int since it calculates integer area
    int area(int x, int y) { 
        return x * y; 
    } 
    
    float area(float r) { 
        return 3.14f * r * r; 
    } 
    
    double area(double l, double b) { 
        return l * b; 
    } 

    public static void main(String[] args) { 
        Method_overloading obj = new Method_overloading(); 
        
        System.out.println("Area of rectangle with integers: " + obj.area(5, 10)); 
        System.out.println("Area of circle: " + obj.area(7.5f)); 
        System.out.println("Area of rectangle with doubles: " + obj.area(5.0, 10.0)); 
    } 
}
