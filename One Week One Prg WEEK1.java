// Base class Account
class Account {
    String name;
    String acctNum;
    String acctType;
    double balance;

    void initialize(String name, String acctNum, String acctType) {
        this.name = name;
        this.acctNum = acctNum;
        this.acctType = acctType;
        this.balance = 0.0;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}

// Derived class SavAcct
class SavAcct extends Account {
    void computeInterest(double rate) {
        double interest = balance * rate / 100;
        deposit(interest);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

// Derived class CurrAcct
class CurrAcct extends Account {
    double minBalance = 1000;
    double penalty = 100;

    void checkMinBalance() {
        if (balance < minBalance) {
            balance -= penalty;
            System.out.println("Penalty of " + penalty + " applied. New balance: " + balance);
        }
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            checkMinBalance();
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

public class Bankprg {
    public static void main(String[] args) {
        SavAcct savAcct = new SavAcct();
        savAcct.initialize("John Doe", "SAV123", "Savings");
        savAcct.deposit(1000);
        savAcct.computeInterest(5);
        savAcct.displayBalance();
        savAcct.withdraw(500);
        savAcct.displayBalance();

        CurrAcct currAcct = new CurrAcct();
        currAcct.initialize("Jane Doe", "CUR123", "Current");
        currAcct.deposit(2000);
        currAcct.withdraw(1500);
        currAcct.displayBalance();
        currAcct.withdraw(600);
        currAcct.displayBalance();
    }
}