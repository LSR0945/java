// import java.util.Scanner;
class String_1 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a A string");
        String  str = "Hello_World"; 
        String str1 = "Hello_World";
        
        // String str = sc.nextLine();
        String lower = str.toLowerCase();
        String upper = str.toUpperCase();
        System.out.println("Lowercase: " + lower);
        System.out.println("Uppercase: " + upper);
        char ch = str.charAt(0);
        System.out.println("First character: " + ch);
        int len = str.length();
        System.out.println("Length: " + len);
        String sub = str.substring(1,4);
        System.out.println("Substring (1,4): " + sub);
        boolean isEqual = str.equals(str1);
        System.out.println("Are the two strings equal? " + isEqual);
        boolean addressEqual =str == str1;
        System.out.println("Are the two strings equal in address? " + addressEqual);

    }
}