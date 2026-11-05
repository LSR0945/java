class Person {
    String name;
    int age;
    Person() {
        this.name = "Unknown";
        this.age = 0;
    }
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void display() {
        System.out.println("Name: " + name + " Age: " + age);
    }
}

class student extends Person {
    String rollno;
    int course;
    student() {
        super();
    }
    student(String n, int a, String r, int c) {
        super(n, a);
        this.rollno = r;
        this.course = c;
    }
    student(String r, int c) {
        super();
        this.rollno = r;
        this.course = c;
    }
    void display() {
        super.display();
        System.out.println("Rollno: " + rollno + " Course: " + course);
    }
}

class ResearchScholar extends student {
    String topic;
    String guide;
    ResearchScholar(String name, int age, String rollno, int course, String topic, String guide) {
        super(name, age, rollno, course);
        this.topic = topic;
        this.guide = guide;
    }
    void display() {
        super.display();
        System.out.println("Topic: " + topic + " Guide: " + guide);
    }
}

public class Multilevel {
    public static void main(String[] args) {
        ResearchScholar obj = new ResearchScholar("satish", 35, "53", 75000, "java", "Mr Arun sir");
        obj.display();
    }
}
