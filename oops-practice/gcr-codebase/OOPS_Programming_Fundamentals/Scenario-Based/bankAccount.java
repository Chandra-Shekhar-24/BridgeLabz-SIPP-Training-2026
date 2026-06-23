package oops-practice.gcr-codebase.OOPS_Programming_Fundamentals.Scenario-Based;

class bankAccount {
    int accountNumber;
    String holder;
    double balance;

    static int totalAccounts = 0;

    BankAccount(int accountNumber, String holder, double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
        totalAccounts++;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println(amount + " deposited");
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println(amount + " withdrawn");
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void getStatement() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holder);
        System.out.println("Balance: " + balance);
        System.out.println();
    }

    public static void main(String[] args) {
        BankAccount a1 = new BankAccount(101, "Rahul", 5000);
        BankAccount a2 = new BankAccount(102, "Aman", 7000);
        BankAccount a3 = new BankAccount(103, "Priya", 9000);

        a1.deposit(1000);
        a1.withdraw(500);
        a1.deposit(200);
        a1.withdraw(100);
        a1.deposit(300);

        a2.deposit(500);
        a2.withdraw(200);
        a2.deposit(1000);
        a2.withdraw(400);
        a2.deposit(100);

        a3.deposit(700);
        a3.withdraw(300);
        a3.deposit(200);
        a3.withdraw(100);
        a3.deposit(500);

        a1.getStatement();
        a2.getStatement();
        a3.getStatement();

        System.out.println("Total Accounts = " + totalAccounts);
    }
}