import java.util.Scanner;
public class p2{
    public static void main(String[] args)
    {
     float english,nepali,math,science,social;
     try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter your English marks");
         english=sc.nextFloat();
         System.out.println("Enter Neplai marks");
         nepali=sc.nextFloat();
         System.out.println("Enter your Mathematic marks");
         math=sc.nextFloat();
         System.out.println("Enter your Science marks");
         science=sc.nextFloat();
         System.out.println("Enter your Social marks");
         social=sc.nextFloat();
    }
     float total=english+nepali+math+science+social;
     float percentage=total*100/500;
     float average=total/5;
     float gpa=percentage/25;
     System.out.println("Total:"+total);
     System.out.println("Average:"+average);
     System.out.println("Percentage:"+percentage);
     System.out.println("GPA:"+gpa);

    System.out.println("Print your result or download it from our websites");

         
    }
}