package Array;

public class MultiDimentional {

    public static void main(String[] args) {
        int [][] num = {{1,2,3},{5,6,8,6,}};

        //calculate the legth of each row

        System.out.println("Length of first row -"+ num[0].length);
        System.out.println("Length of first row -"+ num[1].length);
        System.out.println(num[1][0]);

        for(int i=0; i<num.length;i++){
            for(int j=0; j<num[i].length;j++){
                System.out.println(num[i][j]);
            }
        }





    }
    
}
