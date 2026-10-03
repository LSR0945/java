import java.util.*;
class login{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        final int pass = 1234;
        int attempts =3;
        for(int i =0 ;i<attempts;i++){
            System.out.println("please enter your password");
            int password = sc.nextInt();
            if(password == pass){
                System.out.println("Welcome to the system");
                break;
            }
            else{
                System.out.println("invalid password please try again");
                if(attempts>0){
                    int n = attempts-1-i;
                    System.out.println("you have "+(n)+" attempts left");
                }
            }

             
        }
        System.out.println("you are blocked from the system");

}
}