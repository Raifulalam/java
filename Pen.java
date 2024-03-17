class Pen {
    String name;
    String colour;

    void work() {
        System.out.println("I am working");
        System.out.println("name:" + name);
        System.out.println("colour:" + colour);
    }

    public static void main(String args[]) {
        Pen p1 = new Pen();
        p1.name = "Bulbpen";
        p1.colour = "Blue";
        p1.work();

    }
}