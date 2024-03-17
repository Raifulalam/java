import java.util.Scanner;
public class arrays2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int N=sc.nextInt();
        System.out.println("Enter the number of students:");
        int n=sc.nextInt();
        int marks[]=new int[N];
        while(n==N){
            System.out.println("Number of students can't be equal size of arrays");
        break;                
        }
        System.out.println("Enter marks");
        for (int i=1;i<=n;i++){
            marks[i]=sc.nextInt();
           }
        System.out.println("marks of thr students are:");
        for(int i=1;i<n;i++){
            System.out.println(marks[i]);
        
        }        
        
        

    }
    
}
