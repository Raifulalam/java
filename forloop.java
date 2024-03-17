import java.util.Scanner;
public class forloop {
    public static void main(String[] args){
        for(int i=1; i<=10;i++){
            System.out.println("The value of the variable is "+i);
        }
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            for(int j=1; j<=n;j++){
                System.out.println(j*2-1);
            }
        }

        
    }
    
}
