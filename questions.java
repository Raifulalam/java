import java.util.Scanner;
public class questions
{
    public static void main(String[] agrs)
    {   
        int a,b,c,d,e;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter Your Marks");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        e=sc.nextInt();
        int total=(a+b+c+d+e);
        double per=total*100/500;
        System.out.println("Total marks obtained");
        System.out.println(total);
        System.out.print("Percentage");
        System.out.print(per);
        System.out.println('%');

        



    }
    
    
}