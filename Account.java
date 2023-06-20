package tdd;

public class Account {
    private int balance;
   private int pin;

   public Account(int pin) {
        this.pin = pin;
        balance = 0;

    }



    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount > 0) balance = balance + amount;
    }

    public void withdraw(int amount) {
        balance = balance - amount;
    }

    public int getPin () {
        return pin;
    }


    public void checkBalanceWithPin(int enteredPin) {
        if(enteredPin == pin) System.out.println("Balance:" + balance);
        else System.out.println("Incorrect pin");
    }

    public void depositWithPin(int amount, int enteredPin) {
        if(enteredPin == pin) balance += amount;
        else System.out.println("Failed Transaction");
    }

    public void withdrawWithPin(int amount, int enteredPin) {
        if(enteredPin == pin) balance = balance - amount;
        else System.out.println("Failed Transaction");
    }
}

