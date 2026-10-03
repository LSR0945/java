import java.util.Scanner;
public class TimeGreeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the current hour (0-23):");
        int hour = sc.nextInt();
        if(hour>=0 && hour<12){
            System.out.println("good mornig");
        }
        else if (hour>=12 && hour<18){
            System.out.println("good afternoon");
        }
        else if(hour>=18 && hour<24){
            System.out.println("good evening");
        }
        else{
            System.out.println("Invalid hour entered");
        }
    }
}
