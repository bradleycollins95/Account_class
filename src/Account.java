// Account class that contains a name instance variable
// and methods to set and get its value

class Account {
    private String name; // instance variable
    private double balance;

    public double Account(String name, double balance) {
        this.name = name;
        if (balance > 0.0) {
            this.balance = balance;
        }

    public String getName() {
            return name;
        }

    public double getBalance() {
            return balance;
        }

    public void deposit(double depositAmount) {
            if (depositAmount > 0.0)
                balance = balance + depositAmount;
        }

    public void withdraw(double withdrawAmount) {
            if (withdrawAmount > balance) {
                System.out.println("Your balance is lower than withdraw amount.");
            } else {
                balance -= withdrawAmount;
            }
        }
    }
}
