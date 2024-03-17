import java.util.Scanner;
public class whileloops {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        while(x<=y){
            System.out.println(x+1);
            x+=1;   
               
         }
        System.out.println("Hello"); 
        while(true){
            System.out.println(x+"I love you");
            x+=1;
        }

    }
    
}
