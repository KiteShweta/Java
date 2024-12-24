// Strings and its methods

public class Main9 {
    
    public static void main(String[] args) {
         //create string - 1st way
        String first = "Java";
        String second = "Programming";
        String third = "Java ";

        //create string - 2nd way
        String name = new String("John Geller");


        //get the length of name
        int length = name.length();
        System.out.println("Length of String:"+length);

        // concat first and second strings
        String joinedString = first.concat(second);
        System.out.println("Concatenated String: "+ joinedString);

        //joining by + operator
        String joineString1 = first + second;
        System.out.println("Concatenated String (+): "+joineString1);


        //comparing strings
        boolean result = first.equals(third);
        System.out.println("comparison of 2 strings: "+ result);


        String str = "This is Java \"String\" Programming";

        System.out.println(str);
    }
   


}
