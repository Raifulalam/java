import java.util.Scanner;
public class switchcase1 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter day");
        int day=input.nextInt();
        String message="Thanks for using my codes";
        switch (day) {
            case 1:
               System.out.println("1st day so you need to go office");
               break;
            case 2:
               System.out.println("2nd day of the week, you can start working now.");
               break;
            case 3:
            

        
            default:
               System.out.println(message);
        }

    }
    
}
