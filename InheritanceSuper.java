class Person {
    String name;
    int age;
    
    Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person: " + name + ", " + age);
    }
    
    void display() {
        System.out.println("Name: " + name + " | Age: " + age);
    }
}

class Employee extends Person {
    String company;
    double salary;
    
    Employee(String name, int age, String company, double salary) {
        super(name, age);       // Parent class (Person) ke constructor ko call karta hai (Hamesha pehli line honi chahiye)
        this.company = company;
        this.salary = salary;
        System.out.println("Employee: " + company);
    }
    
    void showDetails() {
        super.display();        // Parent class ke display() method ko call karta hai
        System.out.println("Company: " + company + " | Salary: " + salary);
    }
}

public class InheritanceSuper {
    public static void main(String[] args) {
        // Employee ka object banakar showDetails method call kiya
        new Employee("Arun", 35, "GLA", 75000).showDetails();
    }
}