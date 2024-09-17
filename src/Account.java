public class Account {
        private double balance;
        String name;

//  CONSTRUCTORS
    public Account(double balance) {
        this.balance = balance;
    }
    public Account() {
        this.balance = 0;
    }
    public Account(double balance, String name) {
        this.balance = balance;
        this.name = name;
    }


//  METHODS
    public void withdrawBalance(double withdrawInput) {
        if (withdrawInput <= this.balance) {
            this.balance = this.balance - withdrawInput;
            System.out.println("Successful withdrawal!");
        }else {
            System.out.println("Insufficient funds!");
        }
    }
    public void depositBalance(double depositInput) {
        this.balance = this.balance + depositInput;
        System.out.println("You have successfully deposited " + depositInput + "kr");
    }
    public String toString() {
        return name + "'s Account: " + balance + "kr";
    }


    //  GETTERS AND SETTERS
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
