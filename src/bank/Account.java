package bank;

public class Account {
    private String name;
    private String number;
    private double balance;
    private String pin;

    public Account(double balance, String pin) {
        this.balance = balance;
        this.pin = pin;
    }
    public void setBalance(double amount) {
        balance = amount;
    }

    private boolean checkPin(String pin) {
        return pin.equals(this.pin);
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double amount, String pin) {
        if (checkPin(pin)) {
            if (amount >= 1.0) {
                balance += amount;
            }
        }
        return balance;
    }
    public double withdraw(double amount, String pin) {
        if (checkPin(pin)) {
            if (amount >= 100.0 && amount <= balance) {
                balance -= amount;
            }
        }
        return balance;
    }
}

