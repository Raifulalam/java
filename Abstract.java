abstract class RBI {
    abstract void interestRate();
    abstract void minimumBalance();

    void ppf() {
        System.out.println("Your ppf rate is 3.9%");
    }
}

class SBI extends RBI {
    void interestRate() {
        System.out.println("Your interest Rate is 7.9% for every three month");
    }

    void minimumBalance() {
        System.out.println("Your minimum balance should be greater then 5000");
    }
}

class HDFC extends RBI {
    void interestRate() {
        System.out.println("Your interest Rate is 4.9% for every three month");
    }

    void minimumBalance() {
        System.out.println("Your services can be start from zero balance");
    }
}

public class Abstract {

    public static void main(String[] args) {
        SBI s = new SBI();
        s.minimumBalance();
        s.interestRate();
        s.ppf();
        HDFC h = new HDFC();
        h.minimumBalance();
        h.interestRate();
        s.ppf();
    }

}
