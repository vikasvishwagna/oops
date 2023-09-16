package com.oops;

public class abstraction {
    // about com.oops.abstraction
    //There can be no object of an abstract class.
}
abstract class Animal{
    abstract void walk(); // method with no body , this abstract method should be there in every child method
    public void eat(){
        // we can have other methods
        System.out.println("eats food");
    }
}

class Dog extends Animal{
 void walk(){
     System.out.println("com.oops.Dog walks on 4 legs");
 }//overriding
}
class Chicken extends Animal{
    void walk(){
        System.out.println("com.oops.Chicken walks on 2 legs");
    }
}
class oopsabstraction {
    public static void main(String[] args) {
        Dog dog1 = new Dog();// we can access other class obj by creating the obj of that class
        dog1.walk();
        dog1.eat();

        Chicken chik1 = new Chicken();
        chik1.walk();
        chik1.eat();
    }
}
