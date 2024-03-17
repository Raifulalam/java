import java.util.Scanner;
public class conditional {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter age");
        int age=input.nextInt();
        if (age>19){
            System.out.println("Yes boy you can Drive");


        }
        else{
            System.out.println("Sorry, You are not eligible to drive ");
        }




    } 
    
}
