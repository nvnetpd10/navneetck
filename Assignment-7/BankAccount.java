class BankAccount {
    String accountNumber, holderName;
    double balance;

    BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount("12345", "Navneet", 5000.0);
        System.out.println(b.accountNumber);
        System.out.println(b.holderName);
        System.out.println(b.balance);
    }
}
