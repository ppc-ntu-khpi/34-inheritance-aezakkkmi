package domain;


 /**
 * The class Tiger extends predator
 */ 
public class Tiger extends Predator {

    private String kind;


/** 
 *
 * Tiger
 *
 * @param name  the name
 * @param weight  the weight
 * @param kind  the kind
 */
    public Tiger(String name, int weight, String kind) { 

        this.name = name;
        this.weight = weight;
        this.kind = kind;
    }


/** 
 *
 * Tiger
 *
 */
    public Tiger() { 

        this("kkkkk",250,"Amur tiger");
    }


/** 
 *
 * Tiger
 *
 * @param name  the name
 */
    public Tiger(String name) { 

        this(name,250,"Amur tiger");
    }


/** 
 *
 * Huntingalone
 *
 */
    public void huntingalone(){ 

        System.out.println("Tiger hunts alone...");
    }

    @Override

/** 
 *
 * Haunting
 *
 */
    public void haunting() { 

      System.out.println("Tiger haunting..."); 
    }

    @Override

/** 
 *
 * Hunt
 *
 */
    public void hunt() { 

       System.out.println("Tiger hunts alone for extraction..."); 
    }

    @Override

/** 
 *
 * To string
 *
 */
    public String toString() { 

      return super.toString()+ "\nkind:\t"+this.kind+"\n\nThis is Tiger rrrr!!!";
    }

    @Override

/** 
 *
 * Sleep
 *
 */
    public void sleep(){ 

          System.out.println("Tiger ZzzZzzzz..."); 
        
       
    }

    @Override

/** 
 *
 * Speak
 *
 */
    public void speak() { 

          System.out.println("Rrrrrrrr..."); 
    }

    @Override

/** 
 *
 * Eat
 *
 */
    public void eat() { 

         System.out.println("Tiger eat..."); 
    }
    
}
