public class Main10 {
    public static void main(String[] args) {
        String str1 = "Java Programming";

        //contains()
        boolean result = str1.contains("java");
        System.out.println(result);

        //indexOf()
        int result1 = str1.indexOf('a');
        System.out.println("index of a: "+ result1);

        //substring()
        System.out.println("substring is: "+str1.substring(5));

        // replace()
        String str2 = "bat ball";
        System.out.println("replace: "+ str2.replace('b', 'c'));

        //toLowerCase()
        String str3 = "hello";
        String str4 = "HELLO";

        System.out.println("Converted String: "+ str3.toUpperCase());
        System.out.println("Converted String: "+ str4.toLowerCase());

        //charAt()
        String str5 = "Bengaluru";
        System.out.println("3rd index having: "+ str5.charAt(3));

        // split()
        String str6 = "Python programming";
        String[] resStr6 = str6.split(" ");

        System.out.println("result = ");

        for(String str:resStr6){
            System.out.println(str + ", ");
        }

        //compareTo()
        String s1 = "Learn Java";
        String s2 = "learn Kotlin";

        int res = s1.compareTo(s2);
        System.out.println(res);

        int res1 = s1.compareToIgnoreCase(s2);
        System.out.println(res1);

    }
}
