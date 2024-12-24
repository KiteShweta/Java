package methods;

public class Main2 {

    public int addNumbers(int a,int b){
        int sum = a+b;

        return sum;
    }

    public String Greet(){
        String name="myName";
        return name;
    }

    public static void main(String[] args) {
        int num1=25;
        int num2=23;

        Main2 obj = new Main2();
        Main2 obj2= new Main2();

        int result = obj.addNumbers(num1, num2);
        System.out.println("Sum is:-"+result);

        String result1=obj2.Greet();

        System.out.println(result1);;
    }
    
}
