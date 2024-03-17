import java.util.*;

public class constructor {
    String fname = " ";
    String lname;
    long id;
    long contact;
    String email;
    String paddress;
    String taddress;
    int pincode;
    String father;
    String mother;
    int initial = 5000;
    static double deposite;
    double current = deposite + initial;

    constructor() {
        System.out.println("WELCOME TO MALIK BANK");
        System.out.println("YOUR MINIMUM BALANCE MUST BE RS:5000");
    }

    void info() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name:");
        fname = sc.nextLine();
        System.out.println("Enter your last name:");
        lname = sc.next();
        System.out.println("Enter your contact number:");
        contact = sc.nextLong();
        System.out.println("Enter your ID number:");
        id = sc.nextLong();
        System.out.println("Enter your Email address:");
        email = sc.next();
        System.out.println("Enter your permanent address:");
        paddress = sc.nextLine();
        System.out.println("Enter your temprory address:");
        taddress = sc.nextLine();
        System.out.println("Enter your address pin code:");
        pincode = sc.nextInt();
        System.out.println("Enter your father name:");
        father = sc.nextLine();
        System.out.println("Enter your mother name:");
        mother = sc.nextLine();
        System.out.println("Enter your first deposite amount:");
        deposite = sc.nextDouble();
    }

    void display() {
        System.out.println("NAME:" + fname + lname);
        System.out.println("ACCOUNT NUMBER:" + pincode + contact);
        System.out.println("I'D:" + id);
        System.out.println("CONTACT NUMBER:" + contact);
        System.out.println("EMAIL ADDRESS:" + email + "@gmail.com");
        System.out.println("PERMANENT ADDRESS:" + paddress);
        System.out.println("FATHER NAME:" + father);
        System.out.println("MOTHER NAME:" + mother);
        System.out.println("CURRENT AMOUNT:" + current);
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        constructor obj = new constructor();
        obj.info();
        obj.display();

    }
}
