import java.util.Scanner;
public class table {
    public static void main(String[] args){
        System.out.println("Enter the digit to print Table");
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        System.out.println("Table of"+N);
        for (int i = 1 ;i<=10;i++){
            System.out.println(N+" x "+i+" = "+i*N);
        }

    } 
    
}
