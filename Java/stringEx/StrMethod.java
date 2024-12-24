package stringEx;

public class StrMethod {

    public static void main(String[] args) {
        
        String name="Java Programming";

        System.out.println(name.contains("java"));

        int result=name.indexOf('i');

        System.out.println(result);

        System.out.println("substring is: "+name.substring(4,10));

        String str2="bat ball";

        System.out.println(str2.replace('b', 'c'));

        //tolowercase

        String str3="hello";

        System.out.println(str3.toUpperCase());
        System.out.println(str3.toLowerCase());
        System.out.println(name.charAt(3));
        String str6 ="Python programming";

        String [] str7=str6.split(" ");

        String s1="Learn Java Python";
        String s2="Learn Java";

        int res= s1.compareTo(s2);
        System.out.println(res);
    }
    
}
