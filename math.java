import java.util.*;

public class math {
    int r;
    int l;
    int b;
    int h;

    void areaOfCircle() {
        double area = 3.14 * r * r;
        System.out.println("Area of circle is:" + area);
    }

    void areaOfRectangle() {
        double area = l * b;
        System.out.println("Area of rectangle is :" + area);
    }

    void areaOfSquare() {
        double area = l * l;
        System.out.println("Area of square is:" + area);

    }

    void areaOfCube() {
        double area = 6 * l * l;
        System.out.println(" Area of cube is :" + area);
    }

    void info() {
        System.out.println("Enter 1 to print the area of Circle: ");
        System.out.println("Enter 2 to print the area Rectangle: ");
        System.out.println("Enter 3 to print the area of Square: ");
        System.out.println("Enter 4 to print the area of Cube: ");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        math obj = new math();
        obj.info();
        System.out.print("\nPlease choose any number:");
        int number = sc.nextInt();
        switch (number) {
            case 1: {
                System.out.print("\nEnter radiuis of Circle:");
                obj.r = sc.nextInt();
                obj.areaOfCircle();
                break;

            }
            case 2: {
                System.out.print("\nEnter length and width of Rectangle:");
                obj.l = sc.nextInt();
                obj.b = sc.nextInt();
                obj.areaOfRectangle();
                break;
            }
            case 3: {
                System.out.print("\nEnter side of  square:");
                obj.r = sc.nextInt();
                obj.areaOfSquare();
                break;

            }
            case 4: {
                System.out.print("\nEnter side of cube:");
                obj.r = sc.nextInt();
                obj.areaOfCircle();
                break;
            }
            default: {
                System.out.println("Please choose the correct option");
            }

        }

    }
}
