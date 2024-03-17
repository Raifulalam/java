import java.util.Scanner;

public class string1 {

    public static void main(String[] args) {
        System.out.println("Hello World");
        String name1 = new String("RAIFUL ALAM");
        String name2 = "MOHAMMED";
        Scanner sc = new Scanner(System.in);
        String address = sc.nextLine();
        int age = sc.nextInt();
        // concatination of String
        // String fullname=name1+name2;
        // System.out.println(fullname);
        System.out.println(name2 + name1);
        System.out.println(address);
        System.out.println("Age:" + age);

        // function of String
        // fullname.length();
        // charAt(index);
        // for(int i=0;i<fullname.length;i++){
        // System.out.println(fullname.CharAt(i));
        // }

    }
}
