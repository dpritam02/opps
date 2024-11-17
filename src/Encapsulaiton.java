class bank{
    private int accountNumber;
    private double balance;

    public bank(int AccountNumber, double Balance){
        this.balance = Balance;
        this.accountNumber = AccountNumber;
    }

    public int getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative.");
        }
    }
}


public class Encapsulaiton {
    public static void main(String[] args) {
        bank MyAcc = new bank(12345,67.90);
        System.out.println(MyAcc.getAccountNumber());
        System.out.println(MyAcc.getBalance());

        MyAcc.setBalance(23456.90);
        MyAcc.setAccountNumber(123456789);

        System.out.println(MyAcc.getAccountNumber());
        System.out.println(MyAcc.getBalance());

    }
}
