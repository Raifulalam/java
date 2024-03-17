import java.util.Scanner;
public class logical {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //Logical Operators and, or not
        System.out.println("Please Enter the value of 'a' and 'b'");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        if(sum>=100){
            int new_sum=sum+20;
            System.out.println(new_sum);
        }
        else{
            int below=sum-10;
            System.out.println(below);
        }
        boolean a1=true;
        boolean b1= false;
        if(a1||b1){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }

    }
    
}
