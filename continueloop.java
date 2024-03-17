public class continueloop {
    public static void main(String[] args){
        int i=1;
        while(i<=98){
            System.out.println(i+"my name");
            i++;
            if (i>=50){
                
                continue;
            }
            System.out.println("this step is skiped");
        }
    }    
}
