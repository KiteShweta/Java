class HumanBody{
    public void displayHuman(){
        System.out.println("Method defined inside HumanBody class");
    }
}


interface Male{
    public void displayMale();
}

interface Female {

    public void displayFemale();
}
public class MainChild extends HumanBody implements Male,Female {

    public void displayMale(){
        System.out.println("Implementation of show() method defined inside Male and Female");
    }

    public void displayFemale(){
        System.out.println("Implementation of show() method defined inside Male and Female");
    }
    
    public static void main(String[] args) {
        MainChild obj = new MainChild();

        obj.displayHuman();
        obj.displayFemale();
        obj.displayMale();
    }
}
