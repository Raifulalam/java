class Teacher {
    void teach() {
        System.out.println("many subject");
    }
}

class shubham extends Teacher {
    void show() {
        System.out.println("present");
    }
}

class divya extends Teacher {
    void get() {
        System.out.println("Absent");
    }
}

public class InheritanceHererical {
    shubham s = new shubham();

}
