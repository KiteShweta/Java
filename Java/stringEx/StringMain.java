package stringEx;

public class StringMain {
 public static void main(String[] args) {
    

    String name="I am string";
    String name2=" In JAVA";

    String first = new String("Java");

    //get the lenght of name

    int length = name.length();

    System.out.println(length);

    //CONCAT

    String joined = name.concat(name2);

    System.out.println(joined);
    String joined1=name + name2;
    System.out.println(joined1);

    //compare

    System.out.println(name.equals(name2));
    System.out.println(joined.equals(joined1));


    String str ="This is Java\" String \"Programming";

    System.out.println(str);





}
    
}
