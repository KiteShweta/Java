public class InstanceOf {
    public static void main(String[] args) {
        char ch='a';
        String str ="Java";

        boolean res;

        res=str instanceof String;

        System.out.println("Is str an object of string? "+res);
    }
}
