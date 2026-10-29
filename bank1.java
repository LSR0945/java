import java.util.Scanner;
class bank1{
    String custName;
    int accNum;
    float balance;
    Scanner sc=new Scanner(System.in);
    
    bank1(String name, int accNum, float balance)
    {
          this.custName=name;
          this.accNum=accNum;
          this.balance=balance;

    }

    void inputData(){
          for(int i =01;i<=3;i++)
          {
            System.out.println("Enter customer name: ");
            custName=sc.nextLine();
            System.out.println("Enter account number: ");
            accNum=sc.nextInt();
            System.out.println("Enter balance: ");
            balance=sc.nextFloat();


          }
    }
    void depositAmount(int accNum, float amount)
    {
       

    }
    void withdrawAmount(int accNum, float amount)
    {

    }
    float checkBalance( float balance)
    {
        // Return the current balance to fix the missing return statement.
        return balance;
    }

    void displayDetails(float balance)
    {
        System.out.println("Customer Name: " + custName);
        System.out.println("Account Number: " + accNum);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args)
    {
  

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter customer name: ");
        String name=sc.nextLine();

        System.out.println("Enter account number: ");
        int accNum = sc.nextInt();

        System.out.println("Enter balance: ");
        float balance = sc.nextFloat();

        // Fixed class name mismatch with the actual class declaration.
        bank1 obj2= new bank1(name, accNum, balance);


 


    }
}