class Animal {
    void get() {
        System.out.println("Have four legs");
    }
}

class Dog extends Animal {
    void show() {
        System.out.println("can run");
    }
}

class Tiger extends Dog {
    void live() {
        System.out.println("Live in jungle");
    }
}

class monkey extends Tiger {
    void walk() {
        System.out.println("walk on trees");

    }
}

public class InheritanceMultiple {
    public static void main(String[] args) {
        monkey m = new monkey();
        m.walk();
        m.get();
        m.live();
        m.show();
        Tiger t = new Tiger();
        t.live();
        t.get();
        t.show();
        Dog d = new Dog();
        d.get();
        d.show();
        Animal a = new Animal();
        a.get();
    }

}
