class Vehicle {
    String VehicleNumber;
    String brand;
    double rentalRatePerDay;

    Vehicle(String Vn, String br, double rent) {
        this.VehicleNumber = Vn;
        this.brand = br;
        this.rentalRatePerDay = rent;
    }
}

class car extends Vehicle {
    String model;
    int seatingCapacity;
    String fuilType; 

    
    car(String Vn, String br, double rent, String m, int seat, String fuil) {
        super(Vn, br, rent);  
        this.model = m;
        this.seatingCapacity = seat;
        this.fuilType = fuil;
    }

    void calculatorRent(int days) {
        System.out.println("Total rent for 5 day" + (rentalRatePerDay * days));
    }

    void display() {
        System.out.println("VehicleNumber is => " + VehicleNumber);
        System.out.println("brand is => " + brand);
        System.out.println("rentalRatePerDay is => " + rentalRatePerDay);
        System.out.println("model is = " + model);
        System.out.println("seatingCapacity is => " + seatingCapacity);
        System.out.println("fuilType is = " + fuilType);
    }
}

public class Vehicyle_Renter_System {
    public static void main(String[] args) {
        car c = new car("xyz1123", "mahindra", 1500.0, "xuv700", 7, "diesel");
        c.display();
        c.calculatorRent(5);
    }
}
