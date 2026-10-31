class Account {
    private final String owner;
    private double balance;
    private final int pin;

    public Account(String owner, double opening, int pin) {
        this.owner = owner;
        this.balance = opening;
        this.pin = pin;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amt) {
        if (amt <= 0) {
            log("deposit rejected: " + amt);
            return;
        }
        balance += amt;
        log("deposit " + amt);
    }

    public void withdraw(double amt, int enteredPin) {
        if (!checkPin(enteredPin)) {
            log("withdraw rejected: wrong PIN");
            return;
        }
        if (amt <= 0 || amt > balance) {
            log("withdraw rejected: " + amt);
            return;
        }
        balance -= amt;
        log("withdraw " + amt);
    }

    private boolean checkPin(int p) {
        return p == pin;

    }

    private void log(String msg) {
        System.out.println("[" + owner + "] " + msg);

    }
}

public class Ex1Good {
    public static void main(String[] args) {
        Account a = new Account("Riya", 5000, 4321);
        a.deposit(1000);
        a.deposit(-250000);
        a.withdraw(2000, 1111);
        a.withdraw(2000, 4321);
        System.out.println(a.getOwner() + " has " + a.getBalance());
    }
}