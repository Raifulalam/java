import java.util.Scanner;
    public class d
{
      public static void main(String[] args)
    {
        try (Scanner dc = new Scanner(System.in)) {
            System.out.println("Enter any number");
            float a=dc.nextFloat();
            System.out.println("Enter any float value");
            float b=dc.nextFloat();
            float value=a+b;
            System.out.println(value);
        }


    }
    
}
