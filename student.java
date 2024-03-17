import java.util.Scanner;

class student {

    String name;
    String section;
    long rollno;

    void display() {
        System.out.println(name);
        System.out.println(rollno);
        System.out.println(section);
    }

    public static void main(String[] args) {

        student s1 = new student();
        s1.name = "Mohammed raiful alam";
        s1.section = "N";
        s1.rollno = 47;
        s1.display();

    }

}