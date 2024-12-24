public class Main2 {
    

    //create a user defined method
    public int addNumbers(int a,int b){
        int sum = a+b;
        //return value
        return sum;
    }

    public String Greet(){
        String str = "Good Evening!";
        return str;
    }

    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 23;

        //create an object of Main
        Main2 obj = new Main2();
        Main2 obj2 = new Main2();

        //calling method with parameter 
        int result = obj.addNumbers(num1, num2);
        System.out.println("Sum is: "+ result);

        //calling method without parameter
        String result1 = obj.Greet();
        
        System.out.println(result1);

    }

}
