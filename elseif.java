import java.util.Scanner;
public class elseif {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the age");
        int age=input.nextInt();
        if(age>20){
            System.out.println("you are eligible for job ");
        }
        if(age>=50){
            System.out.println("you can work as an engineer");
        }
        else if(age>40){
            System.out.println("You can work as a junior Engineeer");
        }
        else if (age>30){
            System.out.println("You can work as an Assistant Engineer");
        }
        else if(age>20){
            System.out.println("You are Fresher");
        }
        else{
            System.out.println("Sorry, you cannot apply for any job.");
        }
    }
    
}
