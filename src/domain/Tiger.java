package domain;

public class Tiger extends Predator {

    private String kind;

    public Tiger(String name, int weight, String kind) {
        this.name = name;
        this.weight = weight;
        this.kind = kind;
    }

    public Tiger() {
        this("kkkkk",250,"Amur tiger");
    }

    public Tiger(String name) {
        this(name,250,"Amur tiger");
    }

    public void huntingalone(){
        System.out.println("Tiger hunts alone...");
    }

    @Override
    public void haunting() {
      System.out.println("Tiger haunting..."); 
    }

    @Override
    public void hunt() {
       System.out.println("Tiger hunts alone for extraction..."); 
    }

    @Override
    public String toString() {
      return super.toString()+ "\nkind:\t"+this.kind+"\n\nThis is Tiger rrrr!!!";
    }

    @Override
    public void sleep(){
          System.out.println("Tiger ZzzZzzzz..."); 
        
       
    }

    @Override
    public void speak() {
          System.out.println("Rrrrrrrr..."); 
    }

    @Override
    public void eat() {
         System.out.println("Tiger eat..."); 
    }
    
}
