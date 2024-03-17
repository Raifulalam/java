public class arrays1 {
    public static void main(String[] args){
        int [] marks=new int[5];
        marks[0]=98;
        marks[1]=95;
        marks[2]=97;
        marks[3]=96;
        marks[4]=99;
        System.out.println("Marks in the array are:");
        for (int i = 0 ;i<marks.length;i++){
            System.out.println(marks[i]+" ");
        }
        System.out.println(marks[4]);
    }
    
}
