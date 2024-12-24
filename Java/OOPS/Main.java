class Bicycle {

    //fields
    public int gear = 5;
    String name = "myBicycle";

    // behaviour / method
    public void braking(){
        System.out.println("Braking! "+name);
    }
   
}

public class  Main {
    public static void main(String[] args) {
        // create object
Bicycle sportsBicycle = new Bicycle();

//access fields and behaviour of class
int gear = sportsBicycle.gear;
System.out.println(gear);
sportsBicycle.braking();

Bicycle b1 = new Bicycle();

b1.braking();

    }
    
}


