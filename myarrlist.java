import java.util.*;

public class myarrlist {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(); // Create an empty ArrayList of Integers called 'arr'
        arr.add(10);
        arr.add(15);
        arr.add(20);
        System.out.println(arr);
        arr.size();
        arr.contains(15);
        System.out.println(arr);
        arr.remove(1);
        System.out.println(arr);
        arr.add(0, 18);
        System.out.println(arr);
        int index = arr.indexOf(18);
        System.out.println("The number 18 is at position: " + index);
        Collections.sort(arr); // Sort the array list in ascending order
        System.out.println("Sorted Array List: " + arr);
        System.out.println(arr.get(0));
        System.out.println(arr.size());
    }

}
