import java.util.Scanner;
class BankApp{
    String custName;
    int accNum;
    float balance;
    Scanner sc=new Scanner(System.in);
    
    // // default constructor
    // BankApp()
    // {
    //     custName="";
    //     accNum=0;
    //     balance=0.0f;
    // }
// parameterized constructor
    BankApp(String name, int accNum, float balance)
    {
          this.custName=name;
          this.accNum=accNum;
          this.balance=balance;

    }
    void depositAmount(int accNum, float amount)
    {
        if(balance>=0){
            balance+=amount;
        }

    }
    void withdrawAmount(int accNum, float amount)
    {
      if(balance>=amount){
        balance-=amount;
      }
      else{
        System.out.println("Insufficient balance");
      }

    }
    float checkBalance( float balance)
    {
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
        //  object of bank account class
        // BankAccount obj=new BankAccount();
        // object of bank account class
        // BankAccount obj1=new BankAccount("satish", 12345, 500.50f);


        // object of bank account class with parameterized constructor
        // BankAccount obj2=new BankAccount();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter customer name: ");
        String name=sc.nextLine();

        System.out.println("Enter account number: ");
        int accNum = sc.nextInt();

        System.out.println("Enter balance: ");
        float balance = sc.nextFloat();

        // Fixed the constructor call to use the actual class name in this file.
        BankApp obj2 = new BankApp(name, accNum, balance);


 
       /* 
        obj2.custName = "satish";
        obj2.accNum = 123456789;
        obj2.balance = 500.50f;
     
        obj.openAccount();
        obj.deposit();
        obj.withdrawAmount();
        System.out.println(+obj.checkBalance());
        */


    }
}