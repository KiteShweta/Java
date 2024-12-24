package encapsulation;
class Area{
    private int length;
    private int breadth;


Area(int length, int breadth){
this.length=length;
this.breadth=breadth;
}

public void getArea(){
    int area = length*breadth;
    System.out.println(area);
}
}

public class Encaps {

    public static void main(String[] args) {
        Area rect = new Area(5,6);
        rect.getArea();
    }
    
}
