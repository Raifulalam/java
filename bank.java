public class bank {
    String account_number;
    double balance = 0.0;

    void get(String account_number, double balance) {
        this.account_number = account_number;
        this.balance = balance;
    }

    public double deposite(double amount) {
        return balance + amount;
    }

    public double withdraw(double withdraw) {
        if (withdraw > balance)
            System.out.println("insufficient balance");
        else
            this.balance = balance - withdraw;
        return withdraw;
    }

    public String getAccountNumber() {
        return account_number;
    }

    public double getBalance() {
        return balance;
    }

    public String toString() {
        return "Account Number: " + getAccountNumber() + " Balance: $" + getBalance();
    }
}

class savingAccount extends bank {
    double interestRate;

    void gets(double interestRate) {
        this.interestRate = interestRate;
    }

    public double applyInterestRate() {
        return balance *= interestRate / 100;
    }
}

class checkingAccount extends bank {
    double overDraft;

    checkingAccount(String account_number, double balance, double overDraft) {
        super();
        this.overDraft = overDraft;
    }

    void withdraw(double amount){
        int balance=getBalance+overDraft
    }
}