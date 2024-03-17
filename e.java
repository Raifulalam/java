import java.util.Scanner;
public class e 
{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your name");
            String s=sc.nextLine();
            System.out.print("Hello");
            System.out.println(s);
        }

    }

    

}
