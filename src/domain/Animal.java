package domain;


public class Animal {

    protected String name;

    protected int weight;



    public Animal() { 

        name = "tiger";
        weight = 275;
    }


    public void eat() { 

        System.out.println("Animal eating ...");
    }


    public void speak() { 

        System.out.println("Animal speak ...");
    }




    public void sleep() { 

        System.out.println("Animal ZzzZZzz ");
    }

    @Override
    public String toString() { 

        return "My animal:\n" + "name: " + name + "\nweight: " + weight+" kg" ;
    }
}
