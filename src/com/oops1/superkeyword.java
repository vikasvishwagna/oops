package com.oops;

public class superkeyword {
    // this can be used for inheraitance adn for super key word
    //superkey word refers to meathod,variable,constructor of immediate parent class

    //class 1
}
class person{
    int age;
    String name;

    person(int age,String name){
        this.age = age;
        this.name = name;
    }
    void play(){
        System.out.println("plays sports");
    }
}
class virat extends person{
    int centuries;
    int runs;

    virat(int age,String name,int centuries,int runs){
        super(age,name);
        this.centuries = centuries;
        this.runs = runs;
    }
    void play(){
        System.out.println("plays cricket");
        System.out.println(name + " "+ age +" "+centuries +" "+ runs);
    }
    void display(){
        this.play();
        super.play();
        System.out.println("talks about this and super keyword");
    }

}


//----------------------------------------------------------------------------------------------------------------------------
//talked about this,super keyword
//talked about method overloading,method orriding
    class s1 extends superkeyword {
    // class 2 extended com.oops.superkeyword
        void display(){
            System.out.println("hi");
        }
        void display(int a){
            System.out.println("method overloading ");
        }
        void display(String a, int b){
            System.out.println(a+b);
        }
    }
 class s2 extends  s1 {
     // class 3 extended com.oops.s1
     void display(){
         System.out.println("hello");//method override because parent class has same display method as child.
     }
     void display1(){
              this.display();//refers to the current class local var or method
              super.display();//super variable ref to immediate parent class
              super.display(5);
              super.display("rsrk",8);
            System.out.println("how are u");
        }

     public static void main(String[] args) {
         s2 obj = new s2();
         obj.display1();

         virat v1 = new virat(34,"Virat Kohli",72,13000);
         v1.display();
     }
    }




