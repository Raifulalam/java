import java.util.Scanner;
public class p1 {
    public static void main(String[] args){
        int a,b,c,sum;
        System.out.println("Enter three numbers to add");
        try (Scanner sc = new Scanner(System.in)) {
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
        }
        sum=a+b+c;
        System.out.println(sum);

    }
    
}
