package domain;



 /**
 * The class Animal
 */ 
public class Animal {

    protected String name;

    protected int weight;




/** 
 *
 * It is a constructor. 
 *
 */
    public Animal() {  


        name = "tiger";
        weight = 275;
    }



/** 
 *
 * Eat
 *
 */
    public void eat() {  


        System.out.println("Animal eating ...");
    }



/** 
 *
 * Speak
 *
 */
    public void speak() {  


        System.out.println("Animal speak ...");
    }





/** 
 *
 * Sleep
 *
 */
    public void sleep() {  


        System.out.println("Animal ZzzZZzz ");
    }

    @Override
/** 
 *
 * To string
 *
 * 
 */
    public String toString() {  


        return "My animal:\n" + "name: " + name + "\nweight: " + weight+" kg" ;
    }
}
