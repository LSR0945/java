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

    String[] custName = new String[3];
    accNum = new int[3];
    balance = new float[3];

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

        BankAccount obj2= new BankAccount(name, accNum, balance);


 


    }
}