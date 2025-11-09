class BankAccount {
    static int totalAccounts = 0;
    String name;
    double balance;

    BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
        totalAccounts++;
    }

    void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Invalid deposit amount");
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Invalid withdrawal amount");
        if (amount > balance) throw new IllegalArgumentException("Insufficient balance");
        balance -= amount;
    }

    double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("Navneet", 1000);
        a1.deposit(500);
        a1.withdraw(200);
        System.out.println(a1.name + " Balance: " + a1.getBalance());
        System.out.println("Total Accounts: " + BankAccount.totalAccounts);
    }
}
