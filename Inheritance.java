class Animal {
    void get() {
        System.out.println("Animal");
    }
}

class Dog extends Animal {
    void show() {
        System.out.println("bark");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.show();
        d.get();
    }
}
