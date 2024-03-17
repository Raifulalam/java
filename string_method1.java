public class string_method1 {
    public static void main(String[] args){
        String name="RAIFUL alam";
        System.out.println("Name:"+name);
        int len=name.length();
        System.out.println("length:"+len);
        String small=name.toLowerCase();
        System.out.println("Lowercase:"+small);
        String capitalize =  name.toUpperCase();
        System.out.println("Uppercase:"+capitalize);
        String first_name="         mohammed  ";
        System.out.println(name.trim());//remove all the extra gaps before and after the string
        String trimmed_first_name =first_name.trim();
        System.out.println("Trimmed:"+trimmed_first_name);
        String sub_string=name.substring(3);// remove all the elements befrore the given  index value
        System.out.println("substring:"+sub_string);
        String new_substring= name.substring(6,11);
        // print the string between the brginner index and the last index end is excluding and start is including 
        System.out.println(new_substring);
        // method name. replce is used to replce the cheracter
        String replaced_string= name.replace("RAIFUL","afreen");
        System.out.println(replaced_string);
        boolean start_with=name.startsWith("R");
        System.out.println("Start-with__R:"+start_with);
        boolean ends_with=name.endsWith("L");
        System.out.println("Ends_with.....L:"+ends_with);
        char atIndex=name.charAt(2);
        System.out.println("Character At Index:"+atIndex);
        int indexof=name.indexOf("a");
        System.out.println("Index_Of 'a':"+indexof);
        int new_indexof=name.indexOf("a",5);
        System.out.println("index of 'a' after index 5"+new_indexof);
        int last_index=name.lastIndexOf("m");
        System.out.println("Last_Index of'm':"+last_index);
        int new_lastindexof=name.lastIndexOf("l",6);
        System.out.println("Last index of 'l':"+new_lastindexof);//if given cgar is nit in given index then it will return -1
        boolean equal=name.equals("RAIFUL alam");
        System.out.println("Equal to:"+equal);
        boolean ignore_case=name.equalsIgnoreCase("raiful alam");
        System.out.println("Ignore_equal_case:"+ignore_case);











    }
    
}
