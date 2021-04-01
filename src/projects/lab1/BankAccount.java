package projects.lab1;

public class BankAccount {

    private String name;
    private static int accountNo = 100;
    private double balance;

    public BankAccount(String name){
        this.name = name;
        balance = 0;
        accountNo += 1;
    }

    public BankAccount(String name, double balance){
        this.name = name;
        this.balance = balance;
        accountNo += 1;
    }

    //getters and setters
    public void setName(String name){
        this.name =name;
    }

    public String getName(){
        return name;
    }

    public void setAccountNo(int accountNo){
        this.accountNo = accountNo;
    }

    public int getAccountNo(){
        return accountNo;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public double withdrawFunds() {
        return balance;
    }

    public void withdrawFunds(double fee){
        balance -= fee;
    }

    public void depositFunds(double amount) {
        balance += amount;
    }

    public void depositFunds(double amount, double interestRate){
        double interestAmount = interestRate / 100;
        balance += amount + (balance * interestAmount);
    }

    public void displayAccountInfo() {
        System.out.println("Account No.: " + accountNo);
        System.out.println("Name: " + name);
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount("Shiraz");
        ba1.displayAccountInfo();

        System.out.println("-----------------------------------------");

        BankAccount ba2 = new BankAccount("Alex", 50000);
        ba2.displayAccountInfo();
        ba2.depositFunds(10000);
        ba2.displayAccountInfo();
        ba2.withdrawFunds(5000);
        ba2.displayAccountInfo();

        System.out.println("-----------------------------------------");

        BankAccount ba3 = new BankAccount("Tom", 100000);
        ba3.displayAccountInfo();
        ba3.depositFunds(1000, 10);
        ba3.displayAccountInfo();

        System.out.println("-----------------------------------------");


    }
}
