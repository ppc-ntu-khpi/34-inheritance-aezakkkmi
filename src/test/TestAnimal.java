package test;

import domain.Tiger;
        
public class TestAnimal {

    public static void main(String[] args) {
       Tiger tiger = new Tiger ("kkkkk");
        System.out.println(tiger);
        tiger.hunt();
        tiger.eat();
        tiger.haunting();
        tiger.huntingalone();
        tiger.sleep();
        tiger.speak();
    }
}
