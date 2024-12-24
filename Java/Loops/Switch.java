package Loops;

public class Switch {
    public static void main(String[] args) {
        int number=44;
        String size;

        switch(number){
            case 29:
            size="small";
            break;
            case 44:
            size="medium";
            break;
            case 42:
            size="large";
            case 48:
            size="Extra large";
            break;
             default:
             size="unknown";
        }

        System.out.println(size);
    }
    
}
