import java.util.Scanner;

class method {
    String name;
    int age;
    String address;
    long employid;

    void indetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name");
        this.name = sc.nextLine();
        System.out.println("Enter your Address");
        this.address = sc.nextLine();
        System.out.println("Enter your age:");
        this.age = sc.nextInt();
        System.out.println("Enter your emloyee id");
        this.employid = sc.nextLong();

    }

    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Address: " + this.address);
        System.out.println("Age: " + this.age);
        System.out.println("Employee i'd: " + this.employid);
    }

    public static void main(String agrs[]) {
        method obj1 = new method();
        obj1.indetails();
        obj1.display();
        method obj2 = new method();
        obj2.indetails();
        obj2.display();

    }
}
