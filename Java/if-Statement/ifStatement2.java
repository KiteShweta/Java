

public class ifStatement2 {
    public static void main(String[] args) {
        int num=10;

        if(num < 0){
            System.out.println("The number is negative");
        }
        System.out.println("The number is positive");


        if(num < 0){
            System.out.println("The number is negative");
        }else{
        System.out.println("The number is positive");
        }


        if(num < 0){
        System.out.println("The number is negative");
        }else if(num>0){
        System.out.println("The number is positive");
        }else if(num==0){

        System.out.println("The number is zero");}
        else{
            System.out.println("The last else block");
        }

        int n1=60,n2=40,n3=20,largest;
        if(n1>=n2){
            if(n2>=n3){
                largest=n1;
            }
            else{
                largest=n3;
            }
        }else{
            if(n2>=n3){
                largest=n2;
            }else{
                largest=n3;
            }
        }

        System.out.println("Largest="+largest);

    }
}
