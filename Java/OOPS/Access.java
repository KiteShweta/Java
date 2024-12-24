class Data {

     //private variable
     private String name;

     //getter method
     public String getName(){
        return this.name;
     }

     // setter method
     public void setName(String name){
        this.name = name;
     }

      private void display(){
        System.out.println("This is private method");
      }
}

class Access {

   
    public static void main(String[] args) {
        System.out.println("This is Default Modifier");

        Data d = new Data();

        
        //accessing name property
        d.setName("Java"); 
        System.out.println(d.getName());
    

    }

    
}


